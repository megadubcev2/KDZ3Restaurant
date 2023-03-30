package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class ProductType {
    private int prodTypeId;
    private String prodTypeName;
    private boolean prodIsFood;

    public ProductType(int prodTypeId, String prodTypeName, boolean prodIsFood) {
        this.prodTypeId = prodTypeId;
        this.prodTypeName = prodTypeName;
        this.prodIsFood = prodIsFood;
    }

    public ProductType(){

    }

    public int getProdTypeId() {
        return prodTypeId;
    }

    public String getProdTypeName() {
        return prodTypeName;
    }

    public boolean isProdIsFood() {
        return prodIsFood;
    }
}
