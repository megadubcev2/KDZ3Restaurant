package models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Visitor {
    private String visName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss a z")
    private Date visStarted;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss a z")
    private Date visEnded;

    private double visTotal;
    private List<MenuDish> visDishes;
    private boolean isEnded;

    public Visitor(String visName, List<MenuDish> visDishes) {
        this.visName = visName;
        this.visDishes = visDishes;
        isEnded = false;
    }

    public Visitor() {
    }

    public String getVisName() {
        return visName;
    }

    public Date getVisStarted() {
        return visStarted;
    }

    public Date getVisEnded() {
        return visEnded;
    }

    public double getVisTotal() {
        return visTotal;
    }

    public List<MenuDish> getVisDishes() {
        return visDishes;
    }

    public boolean getIsEnded() {
        return isEnded;
    }

    public void setVisStarted(Date visStarted) {
        this.visStarted = visStarted;
    }

    public void setVisEnded(Date visEnded) {
        this.visEnded = visEnded;
    }

    public void setVisTotal(double visTotal) {
        this.visTotal = visTotal;
    }

    public void setIsEnded(boolean ended) {
        isEnded = ended;
    }
}
