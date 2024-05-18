package net.hajirrasouli.simplespringbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebsiteController {

	@GetMapping("/website")
    public String sayHello() {
        return "Hello, World!";
    }
}
