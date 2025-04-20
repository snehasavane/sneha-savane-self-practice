package com.example.OpenAPI.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class KeyValueService {

    public Map<String,String> data=new HashMap<>();

    public void storeDataInMap(String key, String value){

        data.put(key,value);
        System.out.println(" Data stored in map ");

    }

    public String getDataForOne(String key){
        return data.get(key);
    }

    public void deleteData(String key){
        data.remove(key);
    }
}
