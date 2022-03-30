package com.example.springkafkaproducer.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DATA_TBL")
@Data
public class Message {
    @Id
    @GeneratedValue
    private int id;
    private String message;
}
