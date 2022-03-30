package com.example.springkafkaproducer.controller;

import com.example.springkafkaproducer.model.Message;
import com.example.springkafkaproducer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springkafkaproducer.Database.DatabaseService;
@RestController
public class KafkaController {

    @Autowired
    KafkaProducerService kafkaProducerService;
    @Autowired
    private DatabaseService service;
    @PostMapping("/publish")
    public String publishMessage(@RequestBody Message msg){
        kafkaProducerService.sendMessage(msg);
        service.saveProduct(msg);
        return "your record is saved successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

    @GetMapping("/productById/{id}")
    public Message findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }


}

