package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

@JsonAutoDetect
public class MenuDish {
    private int menuDishId;
    private int menuDishCard;
    private int menuDishPrice;
    private boolean menuDiShActive;


    public MenuDish(int menuDishId, int menuDishCard, int menuDishPrice, boolean menuDiShActive) {
        this.menuDishId = menuDishId;
        this.menuDishCard = menuDishCard;
        this.menuDishPrice = menuDishPrice;
        this.menuDiShActive = menuDiShActive;
    }

    public MenuDish(){

    }


    public int getMenuDishId() {
        return menuDishId;
    }

    public int getMenuDishCard() {
        return menuDishCard;
    }

    public int getMenuDishPrice() {
        return menuDishPrice;
    }

    public boolean getMenuDiShActive(){
        return menuDiShActive;
    }
}
