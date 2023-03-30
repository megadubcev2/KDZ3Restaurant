package agents;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import models.*;
import output.Logout;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class ManagerAgent {
    private RestaurantData restaurantData;
    final private String menuDishesFilePath;
    final private String dishCardsFilePath;
    final private String productTypesFilePath;
    final private String productItemsFilePath;
    final private String operationTypesFilePath;
    final private String equipmentsFilePath;
    final private String equipmentTypesFilePath;
    final private String cookersFilePath;
    final private String newVisitorsFilePath;
    final private String servicedVisitorsFilePath;


    final private VisitorsAgent visitorsAgent;
    final private Logout logout;


    public ManagerAgent() {
        menuDishesFilePath = "src" + File.separator + "jsons" + File.separator + "input" + File.separator + "menu_dishes.json";
        dishCardsFilePath = "src" + File.separator + "jsons" + File.separator + "input" + File.separator + "dish_cards.json";
        productTypesFilePath = "src" + File.separator + "jsons" + File.separator + "input" + File.separator + "product_types.json";
        productItemsFilePath = "src" + File.separator + "jsons" + File.separator + "input" + File.separator + "product_items.json";
        operationTypesFilePath = "src" + File.separator + "jsons" + File.separator + "input" + File.separator + "operation_types.json";
        equipmentsFilePath = "src" + File.separator + "jsons" + File.separator + "input" + File.separator + "equipments.json";
        equipmentTypesFilePath = "src" + File.separator + "jsons" + File.separator + "input" + File.separator + "equipment_types.json";
        cookersFilePath = "src" + File.separator + "jsons" + File.separator + "input" + File.separator + "cookers.json";
        newVisitorsFilePath = "src" + File.separator + "jsons" + File.separator + "input" + File.separator + "new_visitors.json";
        servicedVisitorsFilePath = "src" + File.separator + "jsons" + File.separator + "output" + File.separator + "serviced_visitors.json";


        visitorsAgent = new VisitorsAgent(this);
        logout = new Logout(servicedVisitorsFilePath);

        try {
            restaurantData = new RestaurantData(Paths.get(menuDishesFilePath).toFile(),
                    Paths.get(dishCardsFilePath).toFile(), Paths.get(productTypesFilePath).toFile(),
                    Paths.get(productItemsFilePath).toFile(), Paths.get(operationTypesFilePath).toFile(),
                    Paths.get(equipmentsFilePath).toFile(), Paths.get(equipmentTypesFilePath).toFile(),
                    Paths.get(cookersFilePath).toFile());


        } catch (IOException e) {
            logout.logError(e);
        }
    }

    public void action() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            ObjectReader reader = objectMapper.readerForListOf(Visitor.class);

            List<Visitor> newVisitors = reader.readValue(Paths.get(newVisitorsFilePath).toFile());
            visitorsAgent.setNewVisitors(newVisitors);
            visitorsAgent.action();

        } catch (IOException e) {
            logError(e);
        }
    }

    public void logServicedVisitors(List<Visitor> servicedVisitors) throws IOException {
        logout.logServicedVisitors(servicedVisitors);
    }

    public void logError(Exception e){
        logout.logError(e);
    }
}
