package agents;

import models.Visitor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VisitorsAgent {
    private ManagerAgent managerAgent;
    private List<Visitor> newVisitors;
    private List<SingleVisitorAgent> singleVisitorAgents;
    private List<Visitor> servicedVisitors;

    public VisitorsAgent(ManagerAgent managerAgent) {
        this.managerAgent = managerAgent;
        newVisitors = new ArrayList<>();
        servicedVisitors = new ArrayList<>();
    }


    public void setNewVisitors(List<Visitor> newVisitors) {
        this.newVisitors = newVisitors;
    }

    public void action() {
        singleVisitorAgents = new ArrayList<>();
        for (var newVisitor:
             newVisitors) {
            singleVisitorAgents.add(new SingleVisitorAgent(newVisitor,this, managerAgent));
        }

        for (var singleVisitorAgent:
             singleVisitorAgents) {
            singleVisitorAgent.action();
        }
    }

    public void addServicedVisitor(Visitor visitor) {
        servicedVisitors.add(visitor);
        try {
            managerAgent.logServicedVisitors(servicedVisitors);
        } catch (IOException e) {
            managerAgent.logError(e);
        }
    }
}
