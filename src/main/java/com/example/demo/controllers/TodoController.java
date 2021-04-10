package com.example.demo.controllers;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.services.TodoService;
import com.example.demo.todo.Todo;

@Controller
@SessionAttributes("name")
public class TodoController {

	
	@Autowired
	TodoService todoService;
	
	@GetMapping("/list-todos")
	public String ShowMyTodos(ModelMap model) {
		model.addAttribute("todos",todoService.retrieveTodos("in28Minutes"));
		return "todo-list";
	}
	
	@GetMapping("/add-todos")
	public String showTodoPage() {
		return "todo";
	}
	
	@PostMapping("/add-todos")
	public String addTodos(@RequestParam String desc) {
		
		todoService.addTodo("in28Minutes",desc , new Date(), false);
		return "redirect:list-todos";
	}
	
	@GetMapping("/delete-todo")
	public String deleteTodos(@RequestParam int id) {
		todoService.deleteTodo(id);
		return "redirect:list-todos";
	}
	
	@GetMapping("/update-todo")
	public String updateTodos(ModelMap model,@RequestParam int id) {
		Todo todo = todoService.retrieveTodo(id);
		model.addAttribute("todo",todo);
		return "todo";
	}
	
	
	
}
