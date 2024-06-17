package app.java.spring.spender.spendingbucket;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spendingBucket")
public class SpendingBucketController {

    private final SpendingBucketService spendingBucketService;

    public SpendingBucketController(SpendingBucketService spendingBucketService) {
        this.spendingBucketService = spendingBucketService;
    }

    // Define a new spending bucket
    @PostMapping("")
    public boolean setNewSpendingBucket() {
        return true;
    }

    // Log a purchase tied to an already created bucket
    @PostMapping("/{id}/purchases")
    public boolean setSpendingBucketPurchase() {
        return true;
    }
}
