package app.java.spring.spender.spendingweek;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
public class SpendingWeekRequest {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    private double carryOver;
    private double totalAvailable;

    public SpendingWeekRequest(LocalDate startDate, double carryOver, double totalAvailable) {
        this.startDate = startDate;
        this.carryOver = carryOver;
        this.totalAvailable = totalAvailable;
    }
}
