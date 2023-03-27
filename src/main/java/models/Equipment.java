package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Equipment {
    private int equipType;
    private String equipName;
    private boolean equipActive;

    public Equipment(int equipType, String equipName, boolean equipActive) {
        this.equipType = equipType;
        this.equipName = equipName;
        this.equipActive = equipActive;
    }

    public Equipment() {
    }

    public int getEquipType() {
        return equipType;
    }

    public String getEquipName() {
        return equipName;
    }

    public boolean isEquipActive() {
        return equipActive;
    }
}
