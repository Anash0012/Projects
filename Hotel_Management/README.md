# Hotel Management Application 

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Documentation](#api-documentation)

## Introduction

The Hotel Management Application is a web-based system designed to manage hotel rooms and bookings. It allows hotel administrators to add, update, and delete room information, as well as handle customer reservations.

## Features

- View a list of all hotel rooms.
- View details of a specific hotel room by its ID.
- Add a new hotel room to the system.
- Update an existing hotel room's details.
- Delete a hotel room from the system.
- Check the availability of a hotel room for booking.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database




## Configuration

The application configuration can be found in the `application.properties` file. You may need to modify the database connection settings, server port, or any other properties based on your requirements.

## Usage

Once the application is up and running, you can access the following endpoints:

- `/rooms` - View a list of all hotel rooms .
- `/room/id/{id}` - View details of a specific hotel room by its ID.
- `/room` - Add a new hotel room to the system.
- `/room/id` - Delete a hotel room from the system.
- `/rooms` - Add a list of new hotel rooms to the system.
- `/rooms/price/{price}` - get Room By Price .
- `/rooms/available/and/price/{price}` -get rooms available and below price.
- `/rooms/available/or/price/{price}` -get rooms available or below price.
- `/rooms/AC/or/available` -get available rooms Or Ac Sorted by price.


## API Documentation

API documentation is generated automatically using SpringDoc and can be accessed at `http://localhost:8080/swagger-ui.html` (when the application is running). It provides detailed information about the available REST endpoints, request parameters, and responses.




