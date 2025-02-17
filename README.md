# Overview

This a demo project implemented during the Springboot workshop designed to showcase a simple e-commerce system. The project is structured to manage products, categories, users, orders, and order items. Below is an overview of the key components and their roles:

### Project Structure

- **Main Application**: The entry point of the application is ProductsapiApplication.
- **Configuration**: The project uses Spring profiles to manage different configurations for development, testing, and production environments. The configurations are defined in the following files:
  - application.properties
  - application-dev.properties
  - application-prod.properties
  - application-test.properties
- **Entities**: The project defines several JPA entities to represent the database tables
  - Category
  - Order
  - OrderItem
  - Payment
  - Product
  - User
  - OrderStatus (an enum to represent order statuses)
  - OrderItemPK (a composite key for OrderItem)
- **Repositories**: The project uses Spring Data JPA repositories to perform CRUD operations on the entities:
  - CategoryRepository
  - OrderRepository
  - OrderItemRepository
  - ProductRepository
  - UserRepository
- **Services**: The project defines service classes to handle business logic:
  - CategoryService
  - OrderService
  - ProductService
  - UserService
- **Resources**: The project exposes RESTful APIs through resource classes:
  - CategoryResource
  - OrderResource
  - ProductResource
  - UserResource
- **Exception Handling**: The project includes custom exception handling:
  - ResourceExceptionHandler
  - DatabaseException
  - StandardError
  - ResourceNotFoundException
- **Test Configuration**: The project includes a test configuration class 
  
## Getting Started

### Prerequisites

- Java 17
- Maven 3.9.9
- Docker (for running PostgreSQL)

### Running the Application

1. **Clone the repository:**

    ```sh
    git clone <REPOSITORY_URL>
    cd productsapi
    ```

2. **Build the project:**

    ```sh
    ./mvnw clean install
    ```

3. **Run the application:**

    ```sh
    ./mvnw spring-boot:run
    ```

### Running with Docker (local development)

1. **Start PostgreSQL container:**

    ```sh
    docker run -p 5432:5432 --name my_postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres
    ```

2. **Run the application with the [dev](https://github.com/vinicius-mv/workshop-springboot3/blob/main/src/main/resources/application-dev.properties) profile:**

    ```sh
    ./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
    ```

## Configuration

The application uses different configurations for development, testing, and production environments. These configurations are defined in the following files:

- [application.properties](https://github.com/vinicius-mv/workshop-springboot3/blob/main/src/main/resources/application.properties)
- [application-dev.properties](https://github.com/vinicius-mv/workshop-springboot3/blob/main/src/main/resources/application-dev.properties)
- [application-prod.properties](https://github.com/vinicius-mv/workshop-springboot3/blob/main/src/main/resources/application-prod.properties)
- [application-test.properties](https://github.com/vinicius-mv/workshop-springboot3/blob/main/src/main/resources/application-test.properties)

## API Endpoints

The application exposes the following RESTful APIs:

### Categories

- **GET /categories**: Get all categories
- **GET /categories/{id}**: Get category by ID

### Products

- **GET /products**: Get all products
- **GET /products/{id}**: Get product by ID

### Users

- **GET /users**: Get all users
- **GET /users/{id}**: Get user by ID
- **POST /users**: Create a new user
- **DELETE /users/{id}**: Delete user by ID
- **PUT /users/{id}**: Update user by ID

### Orders

- **GET /orders**: Get all orders
- **GET /orders/{id}**: Get order by ID

## Testing (TODO)

To run the tests, use the following command:

```sh
./mvnw test
```

## Acknowledgments

- [Nélio Alves](https://www.udemy.com/user/nelio-alves/)
