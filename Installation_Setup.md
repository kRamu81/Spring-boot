# Day 2 – Spring Boot Installation & Setup (Step-by-Step)

## Step 1: Open Spring Initializer
- Go to **https://start.spring.io**
- This website helps you generate a Spring Boot project easily.

## Step 2: Select Project Configuration
- **Build Tool:** Maven
- **Language:** Java
- **Spring Boot Version:** Default (recommended)

## Step 3: Project Metadata
- **Group:** `com.codesnippet` (usually company or organization name)
- **Artifact:** `spring-demo-application` (project name)
- **Description:** Optional
- **Package Name:** Auto-generated from Group + Artifact

## Step 4: Packaging & Java Version
- **Packaging:** `Jar` (for standalone backend applications)
- **Java Version:** `17`

> **Note:**
> - **Jar:** Standalone backend applications
> - **War:** Web applications with UI (HTML, CSS, JS)

## Step 5: Add Dependencies
- **Spring Web** – To build REST APIs (uses embedded Tomcat)
- **Spring Data JPA** – For database interaction
- **H2 Database** – In-memory database for local testing

## Step 6: Generate Project
- Click **Generate**
- A ZIP file will be downloaded.

## Step 7: Extract & Open in IDE
- Extract the ZIP file.
- Open the project in your IDE (IntelliJ / Eclipse / VS Code).
- Open the project using the **pom.xml** file.

## Step 8: Understand Project Structure
- `src/main/java` → Application source code
- `SpringDemoApplication.java` → Main class with `main()` method
- `pom.xml` → Maven dependencies and plugins

## Step 9: Run the Application
- Run `SpringDemoApplication.java`
- Application starts on **Tomcat server**
- Default URL: **http://localhost:8080**

## Step 10: Verify
- Browser shows no output (empty project)
- Confirms Spring Boot application is running successfully ✅

---

📌 **Next Video:** Layered Architecture in Spring Boot  
👍 Like, Share & Subscribe to continue learning Spring Boot
