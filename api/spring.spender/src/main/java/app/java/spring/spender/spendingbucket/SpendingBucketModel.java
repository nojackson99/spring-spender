package app.java.spring.spender.spendingbucket;

import app.java.spring.spender.enums.BucketName;

import java.util.List;

public class SpendingBucketModel {
    private int id;
    private BucketName bucketName;
    private int currentTotal;
    private int spentThisWeek;
    private int weeklyAmount;
    private int spendingWeekId;
    private List<Integer> purchaseIds;

    // Constructor
    public SpendingBucketModel(int id, BucketName bucketName, int currentTotal, int spentThisWeek, int weeklyAmount, int spendingWeekId, List<Integer> purchaseIds) {
        this.id = id;
        this.bucketName = bucketName;
        this.currentTotal = currentTotal;
        this.spentThisWeek = spentThisWeek;
        this.weeklyAmount = weeklyAmount;
        this.spendingWeekId = spendingWeekId;
        this.purchaseIds = purchaseIds;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BucketName getBucketName() {
        return bucketName;
    }

    public void setBucketName(BucketName bucketName) {
        this.bucketName = bucketName;
    }

    public int getCurrentTotal() {
        return currentTotal;
    }

    public void setCurrentTotal(int currentTotal) {
        this.currentTotal = currentTotal;
    }

    public int getSpentThisWeek() {
        return spentThisWeek;
    }

    public void setSpentThisWeek(int spentThisWeek) {
        this.spentThisWeek = spentThisWeek;
    }

    public int getWeeklyAmount() {
        return weeklyAmount;
    }

    public void setWeeklyAmount(int weeklyAmount) {
        this.weeklyAmount = weeklyAmount;
    }

    public int getSpendingWeekId() {
        return spendingWeekId;
    }

    public void setSpendingWeekId(int spendingWeekId) {
        this.spendingWeekId = spendingWeekId;
    }

    public List<Integer> getPurchaseIds() {
        return purchaseIds;
    }

    public void setPurchaseIds(List<Integer> purchaseIds) {
        this.purchaseIds = purchaseIds;
    }
}
