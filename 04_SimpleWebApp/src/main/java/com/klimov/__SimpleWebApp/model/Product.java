package com.klimov.__SimpleWebApp.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class Product {

    private int prodId;
    private String prodName;
    private int price;


}


