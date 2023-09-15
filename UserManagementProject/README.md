
# User management Project

## Frameworks and Language Used

- **Java**: The primary programming language used for developing the application.
- **Maven**: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
- **Spring Boot**: Spring Boot is a tool that makes developing web application and microservices with Java Spring Framework faster and easier.
- **Lombok**: Lombok is an annotation-based Java library that allows you to reduce boilerplate code

## Dataflow

The user management application follows the following data flow:

1. **Client Interaction**: The client, such as Postman, sends requests to the Localhost server for user management operations, including creating, reading, updating, and deleting users (CRUD operations).

2. **Controller Layer**: In the Spring Boot application, the incoming requests are handled by the Controller layer. The Controller receives the requests and delegates them to the appropriate methods in the service layer.

3. **Service Layer**: The Service layer contains the business logic of the application and handles user management operations. When a request is received from the Controller, the Service layer performs the necessary actions. For example, when creating a new user, the Service layer validates the input data, generates a unique identifier, and interacts with the data access layer.

4. **Data Access Layer**: The Data Access layer is responsible for interacting with the underlying data storage, such as the UserRepo. In the user management application, it handles CRUD operations on the user data. When creating a new user, the Data Access layer inserts the user's information into the database.

5. **Database**: The database stores the user data. It receives the insert, update, or delete statements from the Data Access layer and performs the corresponding operations on the user table.
This is done uing hashmap.

6. **Response**: After the data operation is completed, the response flows back through the layers in the reverse order. The Service layer receives the response from the Data Access layer, performs any necessary post-processing or formatting, and sends it back to the Controller.

7. **Controller Response**: The Controller layer receives the response from the Service layer and returns an appropriate HTTP response to the client, indicating the success or failure of the requested operation.

## Data Structure

1.  **HashMap**  : This is used for as a DataBase and stores the User InforMation in form of User class.

2. **ArrayList** : ArrayList or list are used in methods for ease of code . They are used for returning or getting data .

## Project Summary

The Project is used as a simple datamanagement system api and helps store access or create user information . 

## Installation and Usage

Run code using an ide and check workings on postman.