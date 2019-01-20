package shchipanov.dev.stupid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SillyRestController {

    @GetMapping(value = "/hello",params = "name")
    public String sillyMethod(String name) {
        return "Hello " + name + "!";
    }
}
