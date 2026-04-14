# order-management-system
JPA project to manage orders

# 📦 Order Management System

**JPA project to manage orders**

## 📖 About the Project

This project is part of the **JPA Specialist course**, focused on understanding how to build a Java application using **pure JPA and Hibernate**, without high-level frameworks like Spring Boot.

The application is initialized through a bootstrap class and configured manually using `persistence.xml`, providing full control over the persistence layer.

---

## 🚀 Technologies & Tools

- Java
- JPA (Jakarta Persistence API)
- Hibernate ORM
- Maven
- MySQL (via Docker)
- Log4j2

---

## 🧠 Current Implementation

At this stage, the project includes:

- JPA configuration using `persistence.xml`
- Hibernate as the JPA provider
- Logging configuration with Log4j2
- Bootstrap class to initialize JPA:
  - `JpaBootstrap.java`
- Docker Compose file for database setup

---

## 🗂️ Project Structure

order-management-system/
│
├── src/
│ └── main/
│ ├── java/com/valmerdev/company/application/
│ │ └── JpaBootstrap.java
│ │
│ └── resources/
│ ├── META-INF/
│ │ └── persistence.xml
│ └── log4j2.xml
│
├── compose.yml
├── pom.xml
└── README.md


---

## ⚙️ How to Run

### 1️⃣ Start database (Docker)


docker compose up -d

### 2️⃣ Build project

mvn clean install

### 3️⃣ Run application

Run the JpaBootstrap class from your IDE.

---

🎯 Learning Goals
- Understand JPA configuration from scratch
- Learn how Hibernate works as a provider
- Control the persistence context manually
- Analyze generated SQL via logging

---

📈 Next Steps
- Create Order entity
- Map relationships
- Implement persistence operations (CRUD)
- Introduce repositories and service layer

---

👨‍💻 Author
- Harlan Goyana
- Backend Java Developer focused on building scalable and maintainable systems.







