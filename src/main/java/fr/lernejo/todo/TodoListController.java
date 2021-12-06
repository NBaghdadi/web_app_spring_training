package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class TodoListController {
    ArrayList<Todo> list = new ArrayList<>();
    @PostMapping(value = "/api/todo")
    public void ajout(@RequestBody Todo todo)
    {
        list.add(todo);

    }
    @GetMapping(value = "/api/todo")
    public ArrayList<Todo> affichage()
    {
        return list;

    }
}
