# Blogging API

This is a RESTful API for a personal blog built with Spring Boot, providing basic CRUD operations for managing blog articles.

## Features

- List all existing articles
- Retrieve a single article by ID
- Create new articles
- Update existing articles
- Delete articles

## API Endpoints

- GET /api/v1/articles - List all articles
- GET /api/v1/articles/{id} - Retrieve a specific article
- POST /api/v1/articles - Create a new article
- PUT /api/v1/articles/{id} - Update an existing article
- DELETE /api/v1/articles/{id} - Delete an article

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

### Prerequisites

- JDK 17 or later
- Maven or Gradle
- PostgreSQL

## Getting Started

  ### 1. Clone the Repository
    git clone https://github.com/yourusername/Blog-Api.git
    cd Blog-Api

  ### 2. Configure Database
    spring.datasource.url=jdbc:postgresql://localhost:5432/blogapi
    spring.datasource.username=your_db_username
    spring.datasource.password=your_db_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
  ### 3. Build the project
    mvn clean install

  ### 4. Run the application
    mvn spring-boot:run
