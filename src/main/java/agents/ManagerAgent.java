package agents;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.*;

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

    final private ErrorAgent errorAgent;



    public ManagerAgent(){
        menuDishesFilePath = "src/jsons/menu_dishes.json";
        dishCardsFilePath = "src/jsons/dish_cards.json";
        productTypesFilePath = "src/jsons/product_types.json";
        productItemsFilePath = "src/jsons/product_items.json";
        operationTypesFilePath = "src/jsons/operation_types.json";
        equipmentsFilePath = "src/jsons/equipments.json";
        equipmentTypesFilePath = "src/jsons/equipment_types.json";
        cookersFilePath = "src/jsons/cookers.json";

        errorAgent = new ErrorAgent();

        try {
            restaurantData = new RestaurantData(Paths.get(menuDishesFilePath).toFile(),
                    Paths.get(dishCardsFilePath).toFile(), Paths.get(productTypesFilePath).toFile(),
                    Paths.get(productItemsFilePath).toFile(), Paths.get(operationTypesFilePath).toFile(),
                    Paths.get(equipmentsFilePath).toFile(), Paths.get(equipmentTypesFilePath).toFile(),
                    Paths.get(cookersFilePath).toFile());
        } catch (IOException e) {
            errorAgent.action();
        }
    }

    public void action(){
    }
}
