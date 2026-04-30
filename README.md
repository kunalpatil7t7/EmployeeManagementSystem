# 🧑‍💼 Employee Management System (Spring Boot + Spring Security)

## 📌 Overview
This is a Spring Boot REST API-based Employee Management System with database authentication and role-based authorization.  
It supports full CRUD operations and follows a layered architecture using Spring Boot, Spring Security, and MySQL.

---

## ⚙️ Features

### 👨‍💼 Employee Management
- Create Employee
- Get all Employees
- Get Employee by ID
- Update Employee

---

### 🔐 Authentication & Authorization
- User registration using `/auth/signup`
- Password encryption using BCrypt
- Database-based authentication using `AppUser`
- Role-based access (ADMIN / USER)
- Custom `UserDetailsService`

---

### 🔗 Relationships
- One-to-Many relationship:
  - One AppUser → multiple Employees

---

### ⚠️ Exception Handling
- Global exception handler for runtime errors
- Structured error response with timestamp, message, and status

---

### 🧱 Architecture
- Controller → Service → Repository → Database
- Clean layered backend design

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

---

## 🗄️ Database Structure

### AppUser
- id
- username
- password
- role
- employees (One-to-Many)

### Employee
- id
- name
- department
- salary
- appUser (Many-to-One)

---

## 🚀 API Endpoints

### 🔐 Authentication
- POST /auth/signup → Register new user

### 👨‍💼 Employee APIs
- GET /employee → Get all employees
- GET /employee/{id} → Get employee by id
- POST /employee → Add employee
- PUT /employee/{id} → Update employee

---

## 🔐 Security Flow
1. User registers via `/auth/signup`
2. Password is encrypted using BCrypt
3. Spring Security loads user from database
4. Role is checked (ADMIN / USER)
5. Access is granted based on role

---

## 🧪 Validation Rules
- Name → must not be blank
- Department → must not be blank
- Salary → must be ≥ 0

---

## 📌 Key Learnings
- Spring Boot REST API development
- Spring Security with database authentication
- BCrypt password encryption
- Role-based authorization
- JPA relationships (One-to-Many / Many-to-One)
- Exception handling in Spring Boot
- Layered architecture

---

## 👨‍💻 Author
**Kunal Patil**  
Java Backend Developer  
GitHub: https://github.com/kunalpatil7t7
