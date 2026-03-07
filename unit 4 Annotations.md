## Spring boot Annotations
### 1 . @springBootApplication 
    - used in main class 
- purpose : to start application , Enables auto configurations 
- it combines : @configuration + @EnableAutoConfiguration+@ComponentScan

### 2 . @Controller
    - Marks class as controller
- used when return the UI(html) page.
- Flow:User -> Server -> DispathServer ->Controller

### 3. @RestController
    - Building Rest Apis
- Returns Json,data only
- combination : @controller+ @ResponseBody

### 4 . @RequestMapping
    - Used to map URL Methods
```java
@RequestMapping(path="/getemployee",
method=RequestNethod.GET
```
- used for path,HTTP method

### 5 . @GetMapping
    - fetching data
### 6 .@PostMapping
    - Adding data
### 7 .@PutMapping
    - updating data
### 8 . @DeletingMapping
    - Deletingdata
### 9.@ResponseBody
- used to return reponsebody instead of rendering ui.
- without it , it returns html page
- with it returns (json/string)
- @restcontroller already include this

### 10.@RequestParam
    - used to query parameter
```java
@GetMapping("/employee")
public String getEmployee(@RequestParam int id)
```

### 11 . @pathVariable
      - used to take value from URL path.
```java
@GetMapping("/employee/{id}")
public String getEmployee(@PathVariable int id)
```

Difference :
RequestParam -> ?id=101
pathvariable -> /employee/101

### 12. @RequestBody
     - used to accept Json from request body
```json
{
  "name": "ramu",
  "employeeId": 1,
  "department": "IT"
}
```
- converts JSON to java object
```java
@PostMapping("/add")
public String getEmployee(@RequestBody Employee emp)
```


### 13. @service
     - Make class as service layer
-used for Business logic , processing , calculations
- It is specilization of @Component

### 14 . @Component
      - Generic Spring bean
-when you mark class with @component:
  - spring creates object
  - -manages life cycle
  - no need to use new keyword

### 15 .@Reepository
     - Marks class as repository layer
-used for Database operations
-It also specilization of @component

### 16 . @Autowired
     - used for Dependency Injection
-spring automatically injects object
