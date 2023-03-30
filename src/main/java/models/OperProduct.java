package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class OperProduct {
    private int prodType;
    private double prodQuantity;

    public OperProduct(int prodType, double prodQuantity) {
        this.prodType = prodType;
        this.prodQuantity = prodQuantity;
    }

    public OperProduct(){
    }

    public int getProdType() {
        return prodType;
    }

    public double getProdQuantity() {
        return prodQuantity;
    }
}
