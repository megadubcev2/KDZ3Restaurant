package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Cooker {
    private int cookId;
    private String cookName;
    private boolean cookActive;

    public Cooker(int cookId, String cookName, boolean cookActive) {
        this.cookId = cookId;
        this.cookName = cookName;
        this.cookActive = cookActive;
    }

    public Cooker(){

    }

    public int getCookId() {
        return cookId;
    }

    public String getCookName() {
        return cookName;
    }

    public boolean isCookActive() {
        return cookActive;
    }
}
