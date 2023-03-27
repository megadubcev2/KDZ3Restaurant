package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class EquipmentType {
    private int equipTypeId;
    private String equipTypeName;

    public EquipmentType(int equipTypeId, String equipTypeName) {
        this.equipTypeId = equipTypeId;
        this.equipTypeName = equipTypeName;
    }

    public EquipmentType(){

    }

    public int getEquipTypeId() {
        return equipTypeId;
    }

    public String getEquipTypeName() {
        return equipTypeName;
    }
}
