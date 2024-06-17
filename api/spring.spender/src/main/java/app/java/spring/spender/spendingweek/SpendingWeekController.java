package app.java.spring.spender.spendingweek;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/spendingWeeks")
public class SpendingWeekController {

    private final SpendingWeekService spendingWeekService;

    public SpendingWeekController(SpendingWeekService spendingWeekService) {
        this.spendingWeekService = spendingWeekService;
    }

    // Create new spending week
    @PostMapping("")
    public boolean setNewSpendingWeek(@RequestBody SpendingWeekRequest spendingWeekRequest) {
        spendingWeekService.setNewSpendingWeek(spendingWeekRequest);

        return true;
    }

    // Get a spending week by id
    @GetMapping("/{id}")
    public boolean getSpendingWeek(@PathVariable int id) {
        return true;
    }

    // Get all spending weeks
    @GetMapping("/all")
    public boolean getAllSpendingWeeks() {
        return true;
    }
}
