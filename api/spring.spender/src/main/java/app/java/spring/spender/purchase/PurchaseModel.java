package app.java.spring.spender.purchase;


import app.java.spring.spender.enums.SpendingCategory;

import java.time.LocalDate;

public class PurchaseModel {
    private int id;
    private LocalDate purchaseDate;
    private int amount;
    private SpendingCategory category;
    private String name;
    private int spendingWeekId;

    // Constructor
    public PurchaseModel(int id, LocalDate purchaseDate, int amount, SpendingCategory category, String name, int spendingWeekId) {
        this.id = id;
        this.purchaseDate = purchaseDate;
        this.amount = amount;
        this.category = category;
        this.name = name;
        this.spendingWeekId = spendingWeekId;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public SpendingCategory getCategory() {
        return category;
    }

    public void setCategory(SpendingCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpendingWeekId() { return spendingWeekId; }

    public void setSpendingWeekId(int spendingWeekId) { this.spendingWeekId = spendingWeekId; }
}
