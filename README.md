# Spring Boot API Versioning & Dockerized CRUD

A RESTful CRUD service built with Spring Boot, Spring Data JPA, MySQL, and Docker Compose demonstrating clean API versioning (`/api/v1` and `/api/v2`).

## Tech Stack
* Java 17
* Spring Boot
* Spring Data JPA / Hibernate
* MySQL 8.0
* Docker & Docker Compose
* Gradle

## Endpoints
* **v1 Endpoints:** `/api/v1/products`
* **v2 Endpoints:** `/api/v2/products`

## Run Locally with Docker Compose
Clone the repository and run:
\`\`\`bash
docker compose up -d --build
\`\`\`
The application will start on port `8080`, and the database will automatically initialize.