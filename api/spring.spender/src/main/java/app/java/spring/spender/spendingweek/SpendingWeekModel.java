package app.java.spring.spender.spendingweek;

import java.time.LocalDate;

public class SpendingWeekModel {
    private LocalDate startDate;
    private LocalDate endDate;
    private int id;
    private double totalSpend;
    private double available;

    // Constructor
    public SpendingWeekModel(LocalDate startDate, LocalDate endDate, int id, double totalSpend, double available) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
        this.totalSpend = totalSpend;
        this.available = available;
    }

    // Getters and Setters
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalSpend() {
        return totalSpend;
    }

    public void setTotalSpend(double totalSpend) {
        this.totalSpend = totalSpend;
    }

    public double getAvailable() {
        return available;
    }

    public void setAvailable(double available) {
        this.available = available;
    }
}
