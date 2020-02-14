package com.mcheung.restbasic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true", allowedHeaders = "*")
public class BasicAuthenticationController {
    //hello-world-bean
    @GetMapping(path="/basicauth")
    public AuthenticationBean helloWorldBean() {
        return new AuthenticationBean("Hello World");
    }
}
