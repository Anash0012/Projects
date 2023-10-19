package com.example.TodoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    List<Todo> todoList;

//    Create Todo Post-Api;

//    add a todo;
    @PostMapping("todo")
    public String addTodo(@RequestBody Todo myTodo){
        todoList.add(myTodo);
        return "Todo is added";
    }

//    get Api

//    get all todos;
    @GetMapping("todos")
    public List<Todo> getAllTodo(){
        return todoList;
    }

//    Update todo

    @PutMapping("todo/id/{Id}/Status")
    public String SetTodoStatusById(@PathVariable Integer Id,@RequestParam boolean flag){
        for (Todo todo:todoList)
        {

            if (todo.getTodoId().equals(Id))
            {
               todo.setTodoStatus(flag);
               return "todo: "+Id+" updated to "+flag;
            }
        }
        return "Invalid Id";
    }

    @DeleteMapping("todo/id/{Id}/Status")
    public String DeleteTodoStatusById(@PathVariable Integer Id){
        for (Todo todo:todoList)
        {

            if (todo.getTodoId().equals(Id))
            {
                todoList.remove(todo);
                return "todo: "+Id+" removed";
            }
        }
        return "Invalid Id";
    }

//    get a list of todos

    @PostMapping("todos")
    public String addTodos(@RequestBody List<Todo> myTodos){
//        for (Todo todo:myTodos) {
//             todoList.add(todo);
//        }
        todoList.addAll(myTodos);
        return myTodos.size()+" todos were added";
    }

//    undone tasks


    @GetMapping("todos/UnDone")
    public List<Todo> getAllUndoneTodo() {
        List<Todo> UnDoneTodos=new ArrayList<>();

        for (Todo todo:todoList)
        {
            if (!todo.isTodoStatus())
            {
                UnDoneTodos.add(todo);
            }
        }
        return UnDoneTodos;

    }

//    Delete todos by id
    @DeleteMapping("todos/ids")
    public List<Todo> RemoveTodos(@RequestBody List<Integer> idList) {

        for (int i = 0; i < todoList.size(); i++) {
            Todo ogTodo = todoList.get(i);
            for (int j = 0; j < idList.size(); j++) {
                if (ogTodo.getTodoId().equals(idList.get(j))) {
                    todoList.remove(ogTodo);
                }
            }
        }
        return todoList;
    }
}
