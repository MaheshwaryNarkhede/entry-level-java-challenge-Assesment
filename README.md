# Entry Level Java Challenge

This repository contains my final submission for the Entry Level Java Challenge assessment. The project is developed using Spring Boot and implements an Employee Management REST API using mock in-memory data. The application follows a clean layered architecture with Controller, Service, and Model components.

---

## Features

- Get all employees
- Get employee by UUID
- Create new employee
- RESTful API implementation
- Mock in-memory data handling
- Layered architecture

---

## Technologies Used

- Java 17
- Spring Boot
- Maven
- REST API
- YAML Configuration

---

## Project Structure

```text
src/main/java/com/challenge/api
│
├── controller
│   └── EmployeeController.java
│
├── service
│   └── EmployeeService.java
│
├── model
│   ├── Employee.java
│   └── EmployeeImpl.java
│
├── exception
│   └── EmployeeNotFoundException.java
│
└── EntryLevelJavaChallengeApplication.java
```

---

## API Endpoints

### Get All Employees

```http
GET /api/v1/employee
```

### Get Employee By UUID

```http
GET /api/v1/employee/{uuid}
```

### Create Employee

```http
POST /api/v1/employee
```

### Sample Request Body

```json
{
  "firstName": "Maheshwary",
  "lastName": "Narkhede",
  "salary": 70000,
  "age": 23,
  "jobTitle": "Backend Developer",
  "email": "temp@gmail.com",
  "contractHireDate": "2026-05-08T10:00:00Z",
  "contractTerminationDate": null
}
```

---

## How to Run the Project

### Clone Repository

```bash
git clone https://github.com/MaheshwaryNarkhede/entry-level-java-challenge.git
```

### Navigate to Project

```bash
cd entry-level-java-challenge
```

### Run Application

```bash
mvn spring-boot:run
```

Application will start on:

```text
http://localhost:8080
```

---

## Author

**Maheshwary Narkhede**
