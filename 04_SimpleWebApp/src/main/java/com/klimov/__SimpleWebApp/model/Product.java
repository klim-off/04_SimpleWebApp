package com.klimov.__SimpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;


}


