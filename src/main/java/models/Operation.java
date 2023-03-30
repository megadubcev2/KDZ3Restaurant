package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;


@JsonAutoDetect
public class Operation {
    private int operType;
    private int equipType;
    private double operTime;
    private int operAsyncPoint;
    private List<OperProduct> operProducts;

    public Operation(int operType,int equipType, double operTime, int operAsyncPoint, List<OperProduct> operProducts) {
        this.operType = operType;
        this.operTime = operTime;
        this.operAsyncPoint = operAsyncPoint;
        this.operProducts = operProducts;
    }

    public Operation(){

    }

    public int getOperType() {
        return operType;
    }

    public int getEquipType(){
        return equipType;
    }

    public double getOperTime() {
        return operTime;
    }

    public int getOperAsyncPoint() {
        return operAsyncPoint;
    }

    public List<OperProduct> getOperProducts() {
        return operProducts;
    }
}
