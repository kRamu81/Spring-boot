# Spring Dependency Injection (DI)

## Why Dependency Injection?

Normally we create objects using the `new` keyword.

### Example (Without Dependency Injection)

```java
public class User {

    Order order = new OnlineOrder(); // concrete implementation

    public User(){
        System.out.println("Initialize User");
    }
}
```

### Problem

* Tight Coupling
* `User` class depends on **concrete implementation**
* If implementation changes → code must change

### Solution

Depend on **abstraction (interface)** instead of implementation.

```java
public class User {

    Order order; // abstraction

}
```

Spring injects dependency automatically using **IoC Container**.

---

# Converting Class to Spring Bean

Using `@Component`

```java
import org.springframework.stereotype.Component;

@Component
public class Order {

    public Order(){
        System.out.println("Initialize Order");
    }

}
```

Inject dependency using `@Autowired`

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Order order;

}
```

Spring automatically injects **Order into User**.

---

# Types of Dependency Injection

1. Field Injection
2. Setter Injection
3. Constructor Injection

**Constructor Injection is mostly used in IT Industry**

---

# 1) Field Injection

Dependency injected **directly into field**

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Order order;

}
```

## Advantages

* Easy to use
* Less code

## Disadvantages

### 1. Cannot use immutable fields

```java
@Autowired
final Order order; // Error
```

### 2. Chance of NullPointerException

```java
User user = new User();
user.processOrder(); // order is null
```

Because the object is created **outside Spring container**.

---

# 2) Setter Injection

Dependency injected using **setter method**

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    Order order;

    @Autowired
    public void setOrder(Order order){
        this.order = order;
    }

}
```

## Advantages

* Dependency can be changed later
* Useful for **JUnit testing**
* Can pass **mock objects**

Example

```java
User user = new User();
user.setOrder(new OnlineOrder());
```

## Disadvantages

* Cannot use immutable fields (`final`)
* Harder to maintain in large classes

---

# 3) Constructor Injection

Dependency injected **during object creation**

```java
import org.springframework.stereotype.Component;

@Component
public class User {

    Order order;

    public User(Order order){
        this.order = order;
    }

}
```

If **only one constructor exists**, `@Autowired` is **not mandatory**.

```java
@Component
public class User {

    Order order;

    public User(Order order){
        this.order = order;
    }

}
```

---

# Advantages of Constructor Injection

### 1. All dependencies injected during initialization

Ensures required dependencies exist.

---

### 2. Avoid NullPointerException

Dependencies must be provided during object creation.

---

### 3. Supports Immutable Objects

```java
private final Order order;
```

---

### 4. Fail Fast

If dependency missing → application fails at startup.

---

# Bean Initialization

Spring beans can be created in two ways.

## 1) Eager Initialization

Bean created **when application starts**

(Default behavior)

---

## 2) Lazy Initialization

Bean created **only when needed**

```java
import org.springframework.context.annotation.Lazy;
import org.springframework.beans.factory.annotation.Autowired;

@Lazy
@Autowired
Order order;
```

---

# Circular Dependency

When two classes depend on each other.

Example

```
User → Order
Order → User
```

### Code Example

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Order order;

}

@Component
public class Order {

    @Autowired
    User user;

}
```

Spring throws **Circular Dependency Error**.

### Solution

Using `@Lazy`

```java
@Autowired
@Lazy
User user;
```

---

# Unsatisfied Dependency

Occurs when Spring **cannot find required bean**.

Example

```
User requires Order
but Order bean not available
```

---

# Multiple Implementation Problem

Example

```
Order (interface)

OnlineOrder
OfflineOrder
```

Spring does not know **which bean to inject**.

---

# Solution 1: @Primary

```java
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OnlineOrder implements Order {
}
```

Spring injects **OnlineOrder by default**.

---

# Solution 2: @Qualifier

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Autowired
@Qualifier("offlineOrder")
Order order;
```

Now Spring injects **OfflineOrder**.

---

# Important Points

* Spring uses **IoC Container**
* Dependencies injected using **@Autowired**
* **Constructor Injection is recommended**
* Helps follow **Dependency Inversion Principle (SOLID)**

---

# Quick Summary

| Injection Type        | Recommended | Immutable Support | Risk                 |
| --------------------- | ----------- | ----------------- | -------------------- |
| Field Injection       | No          | No                | NullPointerException |
| Setter Injection      | Sometimes   | No                | Optional dependency  |
| Constructor Injection | Yes         | Yes               | Safe                 |
