package com.example.demo11.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo11.layer2.Pizza;
import com.example.demo11.layer4.PizzaService;

@RestController
@RequestMapping("/pizzahut")
public class MyPizzaController {
    
    @GetMapping("/greet") // localhost:8080/pizzahut/greet
    public String welcome() {
        return "<h1> Welcome to Spring Controller</h1>";
    }

    @GetMapping("/home") //localhost:8080/pizzahut/home
    public String myHomePage() {
        return "<h1> Welcome to Home </h1>";
    }

    @Autowired  PizzaService pizzaService;

    // localhost:8080/pizzahut/getPizzas
    @GetMapping("/getPizzas") //plural 
    public List<Pizza> getAllThePizzas() {
        System.out.println("getAllPizzas() is retrieving all the pizzas...");
        return pizzaService.getAllPizzas();
    }
    // localhost:8080/pizzahut/getPizza
    @GetMapping("/getPizza/{pid}") //plural 
    public Pizza getTheSinglePizza(@PathVariable("pid") int x) {
        System.out.println("getTheSinglePizza(int) is retrieving a single pizza...");
        return pizzaService.orderingAPizza(x);
    }

}
