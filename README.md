Got it 👍 Here’s a **complete `README.md`** you can drop directly into your **bookstore** repo. It has everything well-structured, professional, and with nice badges at the top for GitHub polish.

````markdown
# 📚 Bookstore Application

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)](https://spring.io/projects/spring-boot)
[![Build](https://img.shields.io/badge/Build-Maven-orange?logo=apache-maven)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A simple **Spring Boot + Spring Data JPA** based Bookstore application that demonstrates how to manage books using REST APIs and an H2/MySQL database.  

---

## 🚀 Features
- ➕ Add new books to the catalog  
- 🔍 Search books by name (supports partial matches)  
- 📋 View all available books  
- ❌ Delete a book by ID  
- ⚡ Uses **Spring Data JPA repositories** for database access  
- 🛢 Works with **H2 (in-memory)** by default, supports **MySQL**  

---

## 🛠️ Tech Stack
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (default, for testing) / **MySQL**
- **Maven**

---

## ⚙️ Setup & Run

### 1. Clone the Repository
```bash
git clone https://github.com/shitalhbhalerao/bookstore.git
cd bookstore
````

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

The app will start at:
👉 `http://localhost:8080`

---

## 💾 Database Configuration

### 🔹 H2 (Default - In-Memory)

No setup required. Access H2 console at:
👉 `http://localhost:8080/h2-console`

* JDBC URL: `jdbc:h2:mem:testdb`
* User: `sa`
* Password: *(leave empty)*

### 🔹 MySQL (Optional)

To use MySQL instead of H2, update `application.properties`:

```properties
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:bookstore
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=crni99
spring.datasource.password=og
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

---

## 🔍 Example REST Endpoints

| Method | Endpoint                | Description                |
| ------ | ----------------------- | -------------------------- |
| GET    | `/books`                | Get all books              |
| GET    | `/books/search?term=xx` | Search books by name       |
| POST   | `/books`                | Add a new book (JSON body) |
| DELETE | `/books/{id}`           | Delete a book by ID        |

**Sample JSON for POST:**

```json
{
  "name": "Spring Boot in Action",
  "author": "Craig Walls",
  "price": 499.99
}
```

---

## 🧪 Testing

Run unit tests:

```bash
mvn test
```


---

👨‍💻 Developed by **[Shital Bhalerao](https://github.com/shitalhbhalerao)**
