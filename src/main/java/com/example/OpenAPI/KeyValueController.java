package com.example.OpenAPI;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/keyValue")
public class KeyValueController {

    @PostMapping
    public void createkeyValue(
            String key,String value) {

        System.out.println(" saving data ");
    }

}
