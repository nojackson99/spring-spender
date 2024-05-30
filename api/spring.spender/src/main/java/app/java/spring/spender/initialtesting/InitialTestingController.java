package app.java.spring.spender.initialtesting;

// Create endpoints to test using the api to create data and get/post
// to rds database

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("testing")
public class InitialTestingController {

    private final InitialTestingService initialTestingService;

    public InitialTestingController(InitialTestingService initialTestingService) {
        this.initialTestingService = initialTestingService;
    }

    // POST seed initial data
    @PostMapping("/seedPurchases")
    public void seedPurchases() {
        initialTestingService.seedPurchases();
    }

    // GET get a purchase by id
    @GetMapping("/getPurchase/{id}")
    public void getPurchase(@PathVariable int id) {
        initialTestingService.getPurchase(id);
    }
}

