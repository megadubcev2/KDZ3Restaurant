package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantData {
        final private List<MenuDish> menuDishes;
        final private List<DishCard> dishCards;
        final private List<ProductType> productTypes;
        final private List<ProductItem> productItems;
        final private List<OperationType> operationTypes;
        final private List<Equipment> equipments;
        final private List<EquipmentType> equipmentTypes;
        final private List<Cooker> cookers;


    public RestaurantData(File menuDishesFile, File dishCardsFile, File productTypesFile,
                          File productItemsFile, File operationTypesFile, File equipmentsFile,
                          File equipmentTypesFile, File cookersFile) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        ObjectReader reader = objectMapper.readerForListOf(MenuDish.class);
        this.menuDishes = reader.readValue(menuDishesFile);

        reader = objectMapper.readerForListOf(DishCard.class);
        this.dishCards =  reader.readValue(dishCardsFile);

        reader = objectMapper.readerForListOf(ProductType.class);
        this.productTypes =  reader.readValue(productTypesFile);

        reader = objectMapper.readerForListOf(ProductItem.class);
        this.productItems =  reader.readValue(productItemsFile);

        reader = objectMapper.readerForListOf(OperationType.class);
        this.operationTypes =  reader.readValue(operationTypesFile);

        reader = objectMapper.readerForListOf(Equipment.class);
        this.equipments =  reader.readValue(equipmentsFile);

        reader = objectMapper.readerForListOf(EquipmentType.class);
        this.equipmentTypes =  reader.readValue(equipmentTypesFile);

        reader = objectMapper.readerForListOf(Cooker.class);
        this.cookers =  reader.readValue(cookersFile);
    }
}
