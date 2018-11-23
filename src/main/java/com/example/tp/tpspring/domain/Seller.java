package com.example.tp.tpspring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.List;

@Entity(name ="seller")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(min = 3, max = 100)
    private String name;
    private String address;
    @Length(max = 5)
    private String zipCode;
    private String city;
    @OneToMany(mappedBy = "seller")
    private List<Product> product;
}
