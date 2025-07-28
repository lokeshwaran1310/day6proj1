# 🐞 Bug Tracker System

## 📘 Description
A simple Java-based **Bug Tracking System** that allows users to log, store, and view software bugs through a console-based interface. This system demonstrates layered architecture using Controller, Service, Repository, and Entity patterns, and integrates with a PostgreSQL database.

---

## 🧩 Components

### 📁 `entity`
Defines the `Bug` class representing a software issue with fields such as `id`, `title`, `description`, and `status`.

### 📁 `controller`
Handles coordination between the UI and the service layer. Validates user inputs and delegates business logic to the service.

### 📁 `service`
Encapsulates business rules and validation logic (e.g., allowed statuses like `open` or `closed`) before data is saved.

### 📁 `repository`
Responsible for direct interaction with the PostgreSQL database using JDBC. Implements insert and retrieval of bugs.

### 📁 `util`
Contains utility classes such as `dbUtil` for establishing database connections.

### 📁 `main`
The application's entry point, which initializes the user interface and starts the menu loop.

---

## 🎨 Design Highlights

- ✅ **Layered architecture**: Clean separation between UI, controller, business logic, and data access layers.
- 🧠 **Validation strategy**: Basic input validation in Controller, domain/business validation in Service.
- 💾 **Database-backed**: Persists data using PostgreSQL and JDBC.
- 🔁 **Extensible**: Can be extended to include more features like bug search, update, and delete.

---

## 🎯 Purpose

This project is designed to demonstrate:

- Java application architecture best practices
- Basic CRUD operations with JDBC
- How to separate concerns between layers (Controller, Service, Repository)
- Working with PostgreSQL databases in Java

---

## 👨‍💻 Author

**Name**: Lokeshwaran M
**Mail**: lokeshwaran.m@epssw.com

