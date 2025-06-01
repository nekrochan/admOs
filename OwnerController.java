import com.example.model.Owner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/owners")
public class OwnerController {
    
    @GetMapping
    public List<Owner> getAllOwners() {
        return Arrays.asList(
            new Owner(1L, "Иванов Иван"),
            new Owner(2L, "Петров Петр")
        );
    }
}
