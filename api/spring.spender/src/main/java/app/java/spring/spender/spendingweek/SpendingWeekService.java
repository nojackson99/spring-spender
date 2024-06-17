package app.java.spring.spender.spendingweek;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SpendingWeekService {
    public SpendingWeekService() {};

    public boolean setNewSpendingWeek(SpendingWeekRequest spendingWeekRequest) {
        // Dereference spendingWeekRequest
        LocalDate startDate = spendingWeekRequest.getStartDate();
        double carryOver = spendingWeekRequest.getCarryOver();
        double totalAvailable = spendingWeekRequest.getTotalAvailable();

        // Set remaining properties needed for SpendingWeekModel
        double available = totalAvailable - carryOver;
        LocalDate endDate = startDate.plusDays(7);

        // TODO: Query sequence for next spendingWeekId
        int spendingWeekId = 0;

        // TODO: use spendingWeek to construct the sql insert statement
        SpendingWeekModel spendingWeek = new SpendingWeekModel(startDate, endDate, spendingWeekId, totalAvailable, available);

        // TODO: return response model with the result of the sql insert and if successful the record id
        return true;
    }

    public boolean getSpendingWeek(int spendingWeekId) {
        // TODO: use spendingWeekId to construct sql select statement

        return true;
    }

    public boolean getAllSpendingWeeks() {
        // TODO: construct sql statement to get all spending weeks

        return true;
    }
}
