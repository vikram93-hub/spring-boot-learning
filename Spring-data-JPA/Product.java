package com.web.webApplication.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity

public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
}
