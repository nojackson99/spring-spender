package app.java.spring.spender.spendingbucket;

import app.java.spring.spender.enums.BucketName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter @Getter @NoArgsConstructor
public class SpendingBucketModel {
    // Getters and Setters
    private int id;
    private BucketName bucketName;
    private double currentTotal;
    private double spentThisWeek;
    private double weeklyAmount;
    private int spendingWeekId;
    private List<Integer> purchaseIds;

    // Constructor
    public SpendingBucketModel(int id, BucketName bucketName, double currentTotal, double spentThisWeek, double weeklyAmount, int spendingWeekId, List<Integer> purchaseIds) {
        this.id = id;
        this.bucketName = bucketName;
        this.currentTotal = currentTotal;
        this.spentThisWeek = spentThisWeek;
        this.weeklyAmount = weeklyAmount;
        this.spendingWeekId = spendingWeekId;
        this.purchaseIds = purchaseIds;
    }

}
