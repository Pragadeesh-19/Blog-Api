# Blogging API

This is a RESTful API for managing a personal blog, built with Spring Boot. It provides basic CRUD operations for handling blog articles.

## Features

- **List All Articles**: Retrieve a list of all existing articles.
- **Retrieve Article by ID**: Get details of a specific article by its ID.
- **Create New Article**: Add a new blog article.
- **Update Existing Article**: Modify an existing article.
- **Delete Article**: Remove an article from the system.

## API Endpoints

- **List All Articles**
  - `GET /api/v1/articles` - List all articles.
- **Retrieve Article by ID**
  - `GET /api/v1/articles/{id}` - Retrieve a specific article by its ID.
- **Create New Article**
  - `POST /api/v1/articles` - Create a new article. Requires a JSON body with article details.
- **Update Existing Article**
  - `PUT /api/v1/articles/{id}` - Update an existing article. Requires a JSON body with updated article details.
- **Delete Article**
  - `DELETE /api/v1/articles/{id}` - Delete an article by its ID.

## Technologies Used

- **Java**: Programming language used for backend development.
- **Spring Boot**: Framework for building the RESTful API.
- **Spring Data JPA**: ORM framework for data access and persistence.
- **PostgreSQL**: Database for storing articles.
- **Maven**: Build tool used for project management.

## Prerequisites

- **JDK 22**
- **Maven** 
- **PostgreSQL**

## Getting Started

1. **Clone the Repository:**

```bash
git clone https://github.com/Pragadeesh-19/Blog-Api.git
cd Blog-Api
```

2. **Configure the Database:**

    Create a PostgreSQL database and update the `application.properties` file with your database credentials:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/blogapi
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    ```

3. **Build and Run the Application:**

    Using Maven:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

### Testing

Use Postman to test the API endpoints. Import the provided Postman collection (if available) for pre-defined tests.

### Contributing

Contributions are welcome! Please open an issue or submit a pull request for any changes or enhancements.
