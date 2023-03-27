package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class ProductItem {
    private int prodItemId;
    private int prodItemType;
    private String prodItemName;
    private String prodItemCompany;
    private String prodItemUnit;
    private double prodItemQuantity;
    private double prodItemCost;
    private String prodItemDelivered;
    private String prodItemValidUntil;

    public ProductItem(int prodItemId, int prodItemType, String prodItemName, String prodItemCompany, String prodItemUnit, double prodItemQuantity, double prodItemCost, String prodItemDelivered, String prodItemValidUntil) {
        this.prodItemId = prodItemId;
        this.prodItemType = prodItemType;
        this.prodItemName = prodItemName;
        this.prodItemCompany = prodItemCompany;
        this.prodItemUnit = prodItemUnit;
        this.prodItemQuantity = prodItemQuantity;
        this.prodItemCost = prodItemCost;
        this.prodItemDelivered = prodItemDelivered;
        this.prodItemValidUntil = prodItemValidUntil;
    }

    public ProductItem() {

    }

    public int getProdItemId() {
        return prodItemId;
    }

    public int getProdItemType() {
        return prodItemType;
    }

    public String getProdItemName() {
        return prodItemName;
    }

    public String getProdItemCompany() {
        return prodItemCompany;
    }

    public String getProdItemUnit() {
        return prodItemUnit;
    }

    public double getProdItemQuantity() {
        return prodItemQuantity;
    }

    public double getProdItemCost() {
        return prodItemCost;
    }

    public String getProdItemDelivered() {
        return prodItemDelivered;
    }

    public String getProdItemValidUntil() {
        return prodItemValidUntil;
    }
}
