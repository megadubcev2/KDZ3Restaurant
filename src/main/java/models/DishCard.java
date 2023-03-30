package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect
public class DishCard {
    private int cardId;
    private String dishName;
    private String cardDescr;
    private double cardTime;
    private List<Operation> operations;

    public DishCard(int cardId, String dishName, String cardDescr, double cardTime, List<Operation> operations) {
        this.cardId = cardId;
        this.dishName = dishName;
        this.cardDescr = cardDescr;
        this.cardTime = cardTime;
        this.operations = operations;
    }

    public DishCard() {
    }

    public int getCardId() {
        return cardId;
    }

    public String getDishName() {
        return dishName;
    }

    public String getCardDescr() {
        return cardDescr;
    }

    public double getCardTime() {
        return cardTime;
    }


    public List<Operation> getOperations() {
        return operations;
    }
}
