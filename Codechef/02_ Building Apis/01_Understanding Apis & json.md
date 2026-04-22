
   
Api => Application programming interface
-> It takes the request from the app/frontend , passes it to backend and brings the response back
-> An api is communication between one application and another application
-> Takes a request and returns a response


How the request and respose Works:

The app sends a request
The API forwards the request to the backend
The backend processes it
The API sends back a response

ex: 
When you place an order in a restaurant:

You place the order
The waiter takes it to the kitchen
The chef prepares the food
The waiter brings the food back to you

What is JSON?

JSON = JavaScript Object Notation
A lightweight, human-readable format for data
Structured with key-value pairs, like a Java Map
Here, In JSON output :
"id", "name", "email" → keys
"1", "Leanne Graham", "leanne@example.com" → values
Values can also be numbers, arrays, or nested objects


```code
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/")
    public Map<String, String> getUser() {
        return Map.of(
                "id", "1",
                "name", "Leanne Graham",
                "email", "leanne@example.com"
        );
    }
}
```
output:
```
{
  "name": "Leanne Graham",
  "email": "leanne@example.com",
  "id": "1"
}
```



