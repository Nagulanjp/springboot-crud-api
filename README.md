# Spring Boot CRUD REST API

This is a simple **Spring Boot CRUD (Create, Read, Update, Delete)** REST API application for managing users. It's built using core Spring Boot features with layered architecture (Controller + Service). It stores data in-memory using `HashMap`.

---

## 🚀 Features

- Add a new user (`POST /addUser`)
- View all users (`GET /users`)
- View a specific user by ID (`GET /user/{id}`)
- Update user details (`PUT /user/{id}`)
- Delete a user (`DELETE /user/{id}`)
- Graceful error handling for missing users

---

## 📦 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Postman (for testing)

---

## 🧪 API Endpoints

| Method | Endpoint         | Description              |
|--------|------------------|--------------------------|
| POST   | `/addUser`       | Add a new user           |
| GET    | `/users`         | Get list of all users    |
| GET    | `/user/{id}`     | Get user by ID           |
| PUT    | `/user/{id}`     | Update existing user     |
| DELETE | `/user/{id}`     | Delete user by ID        |

---

## 📥 Sample JSON for POST/PUT

```json
{
  "id": 101,
  "name": "Nagulan",
  "age": 23
}
🧰 How to Run
Clone this repo:

bash
Copy
Edit
git clone https://github.com/Nagulanjp/springboot-crud-api.git
Open in Eclipse or IntelliJ as Maven project

Run the application from DemoApplication.java

Test with Postman on:

arduino
Copy
Edit
http://localhost:8080
📌 To Improve
Integrate with a real database (H2/MySQL)

Add validation using @Valid

Use Spring Data JPA

Add Swagger documentation

Unit tests with JUnit and Mockito

🙋‍♂️ Author
Nagulan JP

📄 License
This project is open-source and free to use.

yaml
Copy
Edit

---

### ✅ How to Add This to GitHub

1. Create a file in your project root: `README.md`
2. Paste the content above
3. Run in terminal:

```bash
git add README.md
git commit -m "Added project README"
git push origin main
