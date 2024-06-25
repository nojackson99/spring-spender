package app.java.spring.spender.purchase;


import app.java.spring.spender.enums.SpendingCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter @Getter @NoArgsConstructor
public class PurchaseModel {
    // Getters and Setters
    private int id;
    private LocalDate purchaseDate;
    private double amount;
    private SpendingCategory category;
    private String name;
    private int spendingWeekId;

    // Constructor
    public PurchaseModel(int id, LocalDate purchaseDate, double amount, SpendingCategory category, String name, int spendingWeekId) {
        this.id = id;
        this.purchaseDate = purchaseDate;
        this.amount = amount;
        this.category = category;
        this.name = name;
        this.spendingWeekId = spendingWeekId;
    }

}
