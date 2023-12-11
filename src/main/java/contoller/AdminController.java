package contoller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String adminDashboard() {
        return "Welcome to the admin dashboard!";
    }

    @PostMapping("/create")
    public String create() {
        return "Resource created by admin!";
    }

    @PutMapping("/update")
    public String update() {
        return "Resource updated by admin!";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "Resource deleted by admin!";
    }
}
