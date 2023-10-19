# ToDoApp
 

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [Model](#model)
- [API Documentation](#api-documentation)



## Introduction

ToDoApp is a web-based application designed to manage todo tasks. It allows users to create, update, and track their tasks, whether they are completed or not.

## Features

- View a list of all todo tasks.
- View details of a specific todo task by its ID.
- Create a new todo task.
- Update an existing todo task's details.
- Mark a todo task as completed (isTodoDone=true).
- Delete a todo task from the system.

## Technologies Used

- Java
- Spring Boot



## Usage

Once the application is up and running, you can access the following endpoints:

- `/todos` - View a list of all todo tasks .
- `/api/toDoApps/{id}` - View details of a specific todo task by its ID .
- `/todo` - Create a new todo task .
- `/api/toDoApps/{id}` - Update an existing todo task's details .
- `/todo/id/{Id}/Status` - Mark a todo task as completed .
- `/todos` - create a list of todos.
- `/todos/ids` - Delete a todo task from the system .
- `/todos/UnDone` - get All Undone Todo .
- `/todo/id/{Id}/Status` - Delete Todo Status By Id.


## Model

The `ToDo` model represents a todo task with the following attributes:

- `id` (Long): Unique identifier for the todo task.
- `todoName` (String): Name or description of the todo task.
- `todoStatus` (Boolean): Indicates whether the todo task is completed (true) or not (false).

## API Documentation

API documentation is generated automatically using SpringDoc and can be accessed at `http://localhost:8080/swagger-ui.html` (when the application is running). It provides detailed information about the available REST endpoints, request parameters, and responses.



