# 📦 Order Management System

> JPA project to manage orders using pure Hibernate and manual configuration.

---

## 📖 About the Project

This project is part of my journey through the **JPA Specialist course**, focused on mastering persistence with **Jakarta Persistence API (JPA)** and **Hibernate** without relying on high-level frameworks like Spring Boot.

The goal is to deeply understand how ORM works internally, including entity lifecycle, persistence context, and SQL generation.

---

## 🚀 Tech Stack

- **Java**
- **JPA (Jakarta Persistence API)**
- **Hibernate ORM**
- **Maven**
- **MySQL**
- **Docker**
- **Log4j2**

---

## 🧠 What I'm Learning

This project focuses on:

- JPA configuration using `persistence.xml`
- Hibernate as JPA provider
- Entity lifecycle and persistence context
- SQL generation and logging
- Manual configuration without Spring Boot
- Dockerized database environment

---

## 🗂️ Project Structure

order-management-system/
│
├── src/
│ └── main/
│ ├── java/com/valmerdev/company/
│ │ └── application/
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

### 1️⃣ Start database with Docker

docker compose up -d

### 2️⃣ Build the project

mvn clean install

### 3️⃣ Run the application

Run the JpaBootstrap class from your IDE.

---

🎯 Project Status

🚧 In progress — currently setting up the persistence layer and environment.

---

📈 Next Steps
- Create Order entity
- Map relationships
- Implement CRUD operations
- Introduce repository layer
- Add service layer
- Expose REST API (future with Spring Boot)

---

💡 Key Takeaways
- Understanding JPA without abstractions is essential for backend mastery
- Hibernate simplifies persistence but requires careful usage
- ORM is powerful but must be used with performance in mind

---

👨‍💻 Author
- Harlan Goyana
- Backend Java Developer focused on building scalable and maintainable systems.

---

📬 Contact
- LinkedIn: https://www.linkedin.com/in/harlan-goyana-83ba42125/


