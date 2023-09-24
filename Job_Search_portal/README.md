# Job Search Portal

## Frameworks and Languages Used:

- Spring Boot
- Java
- H2 Database
- Maven
- Postman

## Data Flow and Functions:

The Job Search Portal application follows a layered architecture consisting of the following components:

- Controller: The JobController class handles incoming HTTP requests and maps them to specific service methods based on the requested endpoints. It is responsible for interacting with the client and returning appropriate responses.

- Service: The JobService class contains business logic for processing the incoming requests from the controller. It acts as an intermediary between the controller and the repository, providing various CRUD operations and custom search functionalities.

- Repository: The JobRepository interface extends CrudRepository from Spring Data JPA and provides default CRUD operations. Additionally, it includes custom finder methods for searching jobs by title, description, salary, company name, employer name, and location using Spring Data JPA query annotations.

- Database Design: The project uses the H2 Database, an in-memory relational database. The Job entity represents a job listing with various attributes such as title, description, location, salary, companyEmail, companyName, employerName, jobType, and appliedDate.

### Data Structure Used:

The project uses a relational database with tables for storing job data. The database design is based on the Job entity attributes, with each attribute corresponding to a column in the table. The primary key is the id field, which uniquely identifies each job entry.

### Project Summary:

The Job Search Portal is a Spring Boot application that provides RESTful APIs to perform CRUD operations on job listings. It allows users to create new job listings, view job details by ID, update existing job listings, and delete job listings. Additionally, users can perform various custom searches, such as searching by job title, description, salary, company name, employer name, and location.

The application follows a layered architecture, promoting separation of concerns. The controller handles incoming HTTP requests, the service contains the business logic, and the repository manages the interaction with the database. The project uses H2 Database for data storage, making it easy to set up and run locally.


