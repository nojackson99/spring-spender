package app.java.spring.spender.initialtesting;

import org.springframework.stereotype.Service;

@Service
public class InitialTestingService {
    public void seedPurchases() {
        System.out.println("Executing InitialTestingService.seedPurchases");
    }

    public void getPurchase(int purchaseId) {
        System.out.println("Executing InitialTestingService.getPurchase");
        System.out.println("Purchase Id is: " + purchaseId);
    }
}
