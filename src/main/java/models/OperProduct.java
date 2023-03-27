package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class OperProduct {
    private int prodTypeId;
    private double prodQuantity;

    public OperProduct(int prodTypeId, double prodQuantity) {
        this.prodTypeId = prodTypeId;
        this.prodQuantity = prodQuantity;
    }

    public OperProduct(){

    }

    public int getProdTypeId() {
        return prodTypeId;
    }

    public double getProdQuantity() {
        return prodQuantity;
    }
}
