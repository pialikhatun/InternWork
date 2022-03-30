package com.example.springkafkaproducer.Database;

import com.example.springkafkaproducer.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseRepository extends JpaRepository<Message,Integer>{


}
