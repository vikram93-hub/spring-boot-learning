package com.vikram.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Product {

    private int prodId;
    private String prodName;
    private int price;
}



#here we created our own products instead integrating data from MySql so lombok is used.
