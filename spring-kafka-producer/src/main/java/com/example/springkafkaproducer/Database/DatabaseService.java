package com.example.springkafkaproducer.Database;

import com.example.springkafkaproducer.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
    @Autowired
    private DatabaseRepository repository;

    public Message saveProduct(Message product) {
        return repository.save(product);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "message removed !! " + id;
    }
    public Message getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

}
