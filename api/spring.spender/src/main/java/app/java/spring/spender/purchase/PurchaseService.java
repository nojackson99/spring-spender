package app.java.spring.spender.purchase;

import app.java.spring.spender.enums.SpendingCategory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PurchaseService {
    public PurchaseService() {};

    public boolean setNewPurchase(LocalDate purchaseDate, int amount, String category, String name) {
        // TODO: Get spendingWeekID from purchaseDate
        int spendingWeekId = 0;

        // TODO: Figure out how to get next purchaseId
        int purchaseId = 0;

        // TODO: Figure out a good place to tryParse String category to enum
        SpendingCategory spendingCategory = SpendingCategory.OTHER;

        PurchaseModel newPurchase = new PurchaseModel(purchaseId, purchaseDate, amount, spendingCategory, name, spendingWeekId);

        // TODO: use newPurchase to construct the sql insert statement

        return true;
    }

    public boolean getPurchase(int purchaseId) {
        // TODO: use purchaseId to construct sql select statement

        return true;
    }

    public boolean getAllPurchases() {
        // TODO: construct sql statement to get all purchases

        return true;
    }

}
