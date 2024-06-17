package app.java.spring.spender.purchase;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    // Set new purchase
    @PostMapping("")
    public boolean setNewPurchase() {
        return true;
    }

    // Get a purchase
    @GetMapping("/{id}")
    public boolean getPurchase(@PathVariable int id) {
        return true;
    }

    // Get all purchases
    @GetMapping("/all")
    public boolean getAllPurchases() {
        return true;
    }
}
