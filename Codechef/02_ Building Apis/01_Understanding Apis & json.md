
   
# 🌐 API & JSON Basics (Spring Boot Example)

## 🔹 What is an API?

- **API (Application Programming Interface)** allows communication between applications  
- It:
  - Takes a **request** from frontend/app  
  - Sends it to the **backend**  
  - Returns a **response**  

👉 In short:  
**API = Bridge between frontend and backend**

---

## 🔹 How Request & Response Works

1. Client (App/Frontend) sends a request  
2. API forwards it to backend  
3. Backend processes the request  
4. API sends response back to client  

---

## 🔹 Real-Time Example (Restaurant)

- You place an order 🍽️  
- Waiter takes it to kitchen  
- Chef prepares food  
- Waiter brings food back  

👉 Mapping:
- You → Client  
- Waiter → API  
- Kitchen → Backend  

---

## 🔹 What is JSON?

- **JSON = JavaScript Object Notation**
- Lightweight and human-readable format  
- Used to transfer data between systems  

### 📌 Example JSON:

```json
{
  "id": "1",
  "name": "Leanne Graham",
  "email": "leanne@example.com"
}
```
```java

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



