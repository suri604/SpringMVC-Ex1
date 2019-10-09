package com.stackroute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("Arun suri")
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
