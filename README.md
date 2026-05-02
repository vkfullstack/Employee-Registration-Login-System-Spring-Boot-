# Employee Registration & Login System (Spring Boot MVC)

A simple full-stack web application built using **Spring Boot, Thymeleaf, and Spring Data JPA** that allows employees to register, log in, and view their profile.

---

## 🚀 Features

* Employee Registration
* Employee Login Authentication
* Profile Page after login
* Home (Index) Page
* MVC Architecture (Controller, Service, Repository)
* MySQL Database Integration

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA (Hibernate)
* Thymeleaf
* MySQL
* HTML, CSS

---

## 📁 Project Structure

```
src/main/java
 └── in/vk/main
      ├── controller
      ├── service
      ├── repository
      └── entity
```

---

## 🖥️ Screenshots

### 🏠 Home Page (Index)

![Home Page](https://github.com/vkfullstack/Employee-Registration-Login-System-Spring-Boot-/blob/main/Screenshot%202026-05-02%20102031.png?raw=true)



---

## 🔐 Login Page

![Login Page](https://github.com/vkfullstack/Employee-Registration-Login-System-Spring-Boot-/blob/main/Screenshot%202026-05-02%20102322.png?raw=true)

---

## 📝 Registration Page

![Register Page](https://github.com/vkfullstack/Employee-Registration-Login-System-Spring-Boot-/blob/main/Screenshot%202026-05-02%20102128.png?raw=true)

---

## 👤 Profile Page

![Profile Page](https://github.com/vkfullstack/Employee-Registration-Login-System-Spring-Boot-/blob/main/Screenshot%202026-05-02%20102301.png?raw=true)

---

## ⚙️ How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/Vkfullstack/EmployeeRegistrationLoginSystem.git
```

### 2. Import into STS / Eclipse

* File → Import → Maven Project

### 3. Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Run Application

```bash
mvn spring-boot:run
```

---

## 📌 Future Improvements

* Spring Security integration
* Password encryption (BCrypt)
* Role-based login (Admin/Employee)
* Session management

---

## 👨‍💻 Author

* Developed by: *Vijay Khetre*
* Project Type: Mini Project 

---

## 📷 Actual UI Preview

Here is the main dashboard of the system:

![Dashboard](https://github.com/vkfullstack/Employee-Registration-Login-System-Spring-Boot-/blob/main/Screenshot%202026-05-02%20102031.png?raw=true)
