package devpen.app.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    String app() {
        return "Welcome to DevPen!";
    }

    @GetMapping("/home")
    String home() {
        return "OK";
    }

}
