package ui;
import java.util.*;

public class Expense implements Comparable<Expense> {

    private int priority;
    private String type;
    private double amount;

    
    Expense(int priority, String type, double amount) {
        this.priority = priority;
        this.type = type;
        this.amount = amount;
    }

    public void setPriority(int newPriority) {
        this.priority = newPriority;
    }
    public int getPriority() {
        return priority;
    }

    public void setType(String newType) {
        this.type = newType;
    }
    public String getType() {
        return type;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }
    public double getAmount() {
        return amount;
    }

    public int compareTo(Expense other) {
        if (this.priority < other.getPriority()) return -1;
        if (this.priority > other.getPriority()) return 1;
        return 0;
    }
}
