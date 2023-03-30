package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class MenuDish {
    private int menuDishId;
    private int menuDishCard;
    private double menuDishPrice;
    private boolean menuDiShActive;


    public MenuDish(int menuDishId, int menuDishCard, double menuDishPrice, boolean menuDiShActive) {
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

    public double getMenuDishPrice() {
        return menuDishPrice;
    }

    public boolean getMenuDiShActive(){
        return menuDiShActive;
    }
}
