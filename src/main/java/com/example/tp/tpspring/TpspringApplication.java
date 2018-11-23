package com.example.tp.tpspring;

import com.example.tp.tpspring.Services.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpspringApplication {
    @Autowired
    private DataLoader dataLoader;

    public static void main(String[] args) {


        SpringApplication.run(TpspringApplication.class, args);
    }
}
