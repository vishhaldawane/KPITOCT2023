package com.example.demo11.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo11.layer2.Pizza;
import com.example.demo11.layer4.PizzaAlreadyExistException;
import com.example.demo11.layer4.PizzaNotFoundException;
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
    // localhost:8080/pizzahut/getPizza/1
    @GetMapping("/getPizza/{pid}") //plural 
    public ResponseEntity getTheSinglePizza(@PathVariable("pid") int x) {
        System.out.println("getTheSinglePizza(int) is retrieving a single pizza...");
        try {
            Pizza pizza = pizzaService.orderingAPizza(x);
            return ResponseEntity.status(HttpStatus.FOUND).body(pizza);
        }
        catch(RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PostMapping("/addPizza")  
    public ResponseEntity addANewPizza(@RequestBody Pizza pizzaToAdd) {
        System.out.println("addANewPizza(Pizza) is Adding a new pizza...");
        try {
            pizzaService.createPizza(pizzaToAdd);
            return ResponseEntity.status(HttpStatus.FOUND).body("Pizza successfully created...");
        }
        catch(PizzaAlreadyExistException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    @PutMapping("/modifyPizza")  
    public ResponseEntity editExistingPizza(@RequestBody Pizza pizzaToModify) {
        System.out.println("editExistingPizza(Pizza) is modifying a new pizza...");
        try {
            pizzaService.modifyPizza(pizzaToModify);
            return ResponseEntity.status(HttpStatus.FOUND).body("Pizza successfully modified...");
        }
        catch(PizzaNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/deletePizza/{pid}")  
    public ResponseEntity removeExistingPizza(@PathVariable("pid") int pizzaId) {
        System.out.println("removeExistingPizza(int) is deleting an existing pizza...");
        try {
            pizzaService.deletePizza(pizzaId);
            return ResponseEntity.status(HttpStatus.FOUND).body("Pizza successfully deleted...");
        }
        catch(PizzaNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


}
