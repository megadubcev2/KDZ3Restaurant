package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class OperationType {
    private int operTypeId;
    private String operTypeName;

    public OperationType(int operTypeId, String operTypeName) {
        this.operTypeId = operTypeId;
        this.operTypeName = operTypeName;
    }

    public OperationType(){}

    public int getOperTypeId() {
        return operTypeId;
    }

    public String getOperTypeName() {
        return operTypeName;
    }
}
