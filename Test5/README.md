
# *Ecommerce API*


## Frameworks and Language Used

- **Java**
- **Spring Boot**
- **MySQL**
- **Swagger UI**
- **Hibernate**

## API Endpoints
The following endpoints are available in the API:

### User Endpoints
- **GET /user/{id}-** Get a User by ID
- **POST /users-** Create new Users

### Product Endpoints
- **GET /products-** Get all products
- **POST /products-** Create new products
- **DELETE /products-** Delete a product by id

### Address Endpoints
- **POST /addresses-** Create new address

### Order Endpoints
- **GET /order/{id}-** Get a order by ID
- **POST /order-** Create a new order


## Controllers
The project has four controllers:
### UserController
- Handles requests related to the User model

### ProductController
- Handles requests related to the Product model

### OrderController
- Handles requests related to the Order model

### AddressController
- Handles requests related to the Address model

## Services
The project has four services:
### UserService
- Handles CRUD operations on the User model

### ProductService
- Handles CRUD operations on the Product model

### OrderService
- Handles CRUD operations on the Order model

### AddressService
- Handles CRUD operations on the Address model

## Repositories
The project has four repositories:
### UserRepo
- Provides access to the User data source

### ProductRepo
- Provides access to the Product data source

### OrderRepo
- Provides access to the Order data source

### AddressRepo
- Provides access to the Address data source

## Project Summary

The Ecommerce API is designed to provide functionality for managing an ecommerce platform. It includes features such as browsing products, adding items to the cart, placing orders, managing user information, and more. The application is built using Spring Boot and uses MySQL as the database for storing ecommerce data.

## Database

The Ecommerce API uses MySQL as the database to store ecommerce data. 
