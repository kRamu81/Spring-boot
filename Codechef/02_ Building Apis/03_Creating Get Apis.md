1)GetMapping
  --> @GetMapping is used in Spring Boot to create GET API endpoints, which are meant to retrieve data from the server.
The other annotations are used for different operations like creating, updating, or deleting data.

2) Default response format Get Api is JSON
   --> @RestController automatically converts Java objects into JSON responses.
   
```java

package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/api/fruits")
public class FruitController {

    // GET /api/fruits/apple
    @GetMapping("/apple")
    public Fruit getApple() {
        return new Fruit("Apple", "Sweet");
    }

    // GET /api/fruits/banana
    @GetMapping("/banana")
    public Fruit getBanana() {
        return new Fruit("Banana", "Sweet");
    }

    // GET /api/fruits/lemon
    @GetMapping("/lemon")
    public Fruit getLemon() {
        return new Fruit("Lemon", "Sour");
    }

    // GET /api/fruits/all
    @GetMapping("/all")
    public List<Fruit> getAllFruits() {
        return Arrays.asList(
            new Fruit("Apple", "Sweet"),
            new Fruit("Banana", "Sweet"),
            new Fruit("Lemon", "Sour")
        );
    }
}

// Fruit class
class Fruit {
    private String name;
    private String taste;

    public Fruit(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    public String getName() { return name; }
    public String getTaste() { return taste; }
}


```

output :
Api tester link : https://radiant-gull.codechef-apps.com/#1776874613435
<img width="331" height="362" alt="image" src="https://github.com/user-attachments/assets/25c232ff-ab1d-4955-bc08-d5be779e7c15" />

<img width="320" height="389" alt="image" src="https://github.com/user-attachments/assets/566c2d3f-9a4a-4d7c-9581-fd028fa5edae" />

