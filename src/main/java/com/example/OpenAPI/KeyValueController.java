package com.example.OpenAPI;

import com.example.OpenAPI.service.KeyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/keyValue")
public class KeyValueController {

    @Autowired
    private KeyValueService keyValueService;

    @PostMapping
    public void createkeyValue(
            String key,String value) {
        keyValueService.storeDataInMap(key,value);
        System.out.println(" saving data ");
    }

    @GetMapping
    public ResponseEntity<String> getDataForOne(String key){
        String result=keyValueService.getDataForOne(key);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping
    public void deleteData(String key){

        keyValueService.deleteData(key);
    }
}
