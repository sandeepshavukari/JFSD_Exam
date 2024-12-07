package com.klef.jfsd.exam.service;
//package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    // URL for the Fake Store API
    private final String API_URL = "https://fakestoreapi.com/products";

    @Autowired
    private RestTemplate restTemplate;

    public List<Map<String, Object>> getAllProducts() {
        // Fetch data from the Fake Store API
        Map<String, Object>[] products = restTemplate.getForObject(API_URL, Map[].class);

        // Convert the response to a List
        return Arrays.asList(products);
    }
}
