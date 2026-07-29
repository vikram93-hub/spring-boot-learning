# Spring Data JPA

## Overview

Spring Data JPA simplifies database access in Spring Boot applications by reducing boilerplate code required for data persistence. It builds on top of JPA (Java Persistence API) and uses Hibernate as the default JPA implementation.

In this module, I learned how to connect a Spring Boot application to a MySQL database and perform database operations using Spring Data JPA repositories.

---

## Topics Covered

* Introduction to Spring Data JPA
* Java Persistence API (JPA)
* Hibernate as the JPA Provider
* Database Configuration
* Entity Mapping
* Repository Pattern
* `JpaRepository`
* Basic CRUD Operations

---

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

---

## Key Annotations

* `@Entity` – Maps a Java class to a database table.
* `@Id` – Marks the primary key of an entity.
* `@GeneratedValue` – Automatically generates primary key values.
* `@SpringBootApplication` – Entry point of the Spring Boot application.
* `@Repository` *(or by extending `JpaRepository`)* – Provides database access functionality.

---

## What I Learned

* How JPA maps Java objects to database tables.
* How Hibernate manages database interactions.
* How to configure a database connection in Spring Boot.
* How to create repositories by extending `JpaRepository`.
* How to perform basic Create, Read, Update, and Delete (CRUD) operations.

## Learning Outcome

This module helped me understand how Spring Boot simplifies database operations using Spring Data JPA. Instead of writing SQL for every operation, I learned how repositories can provide common CRUD functionality with minimal code.

---

## Status

* ✅ Topic Completed
* 💻 Code available in the `code` folder


