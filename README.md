# 🛒 E-commerce Platform with Recommendation System

## 📌 Project Overview

This project is an online e-commerce platform integrated with a recommendation system. It aims to provide users with personalized product recommendations based on their behavior and preferences.

The system simulates a real-world shopping platform with features like product browsing, user management, and intelligent recommendations.

---

## 🚀 Features

* 👤 User registration and login
* 🛍️ Product browsing and search
* 📊 User behavior tracking (clicks, views, purchases)
* 🎯 Personalized recommendation system
* 🧾 Order management
* ⚡ Backend built with scalable architecture

---

## 🧠 Recommendation Mechanism

The recommendation system is based on:

* **User-based Collaborative Filtering**
* **Item-based Recommendation**
* **User behavior analysis**

It analyzes user interactions such as:

* Browsing history
* Purchase records
* Click frequency

Then generates personalized product suggestions.

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* MyBatis / JPA

### Database

* MySQL

### Optional Enhancements

* Redis (caching)
* Elasticsearch (search optimization)

---

## 🧩 System Architecture

```
Client (Frontend)
       ↓
Spring Boot Backend
       ↓
Database (MySQL)
       ↓
Recommendation Module
```

---

## 📂 Project Structure

```
├── controller     # API layer
├── service        # Business logic
├── mapper/dao     # Data access
├── entity         # Data models
├── config         # Configuration
└── utils          # Utility classes
```

---

## 📸 Screenshots

* Homepage
  <img width="1919" height="970" alt="屏幕截图 2026-03-23 210252" src="https://github.com/user-attachments/assets/29718503-dc95-4553-89ae-043a49bfe9ca" />

* Product page
  <img width="1919" height="959" alt="屏幕截图 2026-03-23 210351" src="https://github.com/user-attachments/assets/fe94a5c6-3419-457d-b51b-ac131d520cdf" />

* Recommendation results
  <img width="1168" height="887" alt="屏幕截图 2026-03-23 210322" src="https://github.com/user-attachments/assets/6f79b614-da19-4bc8-be45-8350bd067f5d" />

---

## 🔧 How to Run

1. Clone the repository

```
git clone https://github.com/your-username/ecommerce-recommendation-system.git
```

2. Configure database in `application.yml`

3. Run the project

```
mvn spring-boot:run
```

---

## 🌟 Highlights

* Combines **e-commerce + recommendation system**
* Demonstrates **real-world backend development skills**
* Shows understanding of **data-driven personalization**
* Scalable and modular design

---

## 📈 Future Improvements

* Add deep learning recommendation models
* Improve recommendation accuracy
* Build a frontend UI (Vue/React)
* Deploy on cloud (Docker + AWS)

---

## 👨‍💻 Author

* csyhhiii

---

## 📄 License

This project is for learning and demonstration purposes.
