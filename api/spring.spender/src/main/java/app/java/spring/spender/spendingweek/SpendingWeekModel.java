package app.java.spring.spender.spendingweek;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
public class SpendingWeekModel {
    private LocalDate startDate;
    private LocalDate endDate;
    private int id;
    private double totalAvailable;
    private double available;

    // Constructor
    public SpendingWeekModel(LocalDate startDate, LocalDate endDate, int id, double totalAvailable, double available) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
        this.totalAvailable = totalAvailable;
        this.available = available;
    }
}
