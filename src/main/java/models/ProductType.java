package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class ProductType {
    private int productTypeId;
    private String productTypeName;
    private boolean prodIsFood;

    public ProductType(int productTypeId, String productTypeName, boolean prodIsFood) {
        this.productTypeId = productTypeId;
        this.productTypeName = productTypeName;
        this.prodIsFood = prodIsFood;
    }

    public ProductType(){

    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public boolean isProdIsFood() {
        return prodIsFood;
    }
}
