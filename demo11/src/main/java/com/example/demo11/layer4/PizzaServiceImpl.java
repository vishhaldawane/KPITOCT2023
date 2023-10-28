package com.example.demo11.layer4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo11.layer2.Pizza;
import com.example.demo11.layer3.PizzaRepository;

@Service // it contains business logic of your pizza project system
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    PizzaRepository pizzaRepository;

    @Override
    public Pizza orderingAPizza(int id) 
    { // a service function
        
        Pizza pizza = null;

        if(id<0) {
            throw new RuntimeException("Pizza id cannot be negative...");
        }
        else {
            Optional<Pizza> optionalPizza = pizzaRepository.findById(id); //is invoking repo function
            if(optionalPizza.isPresent()) {
                pizza = optionalPizza.get();
            }
            else {
                throw new PizzaNotFoundException("Pizza not found with this id : "+id);
            }
        }
        return pizza;
    }

    @Override
    public List<Pizza> getAllPizzas() {

        List<Pizza> pizzaList = (List<Pizza>) pizzaRepository.findAll();
        if(pizzaList.size() > 0)
            return pizzaList;
        else {
            throw new RuntimeException("Pizza table is empty");
        }
    }

    @Override
    public void createPizza(Pizza pizza) throws PizzaAlreadyExistException {
        
        Optional<Pizza> optionalPizza = pizzaRepository.findById(pizza.getPizzaNumber());
        if(optionalPizza.isPresent()) {
            throw new PizzaAlreadyExistException("Pizza is alreay present...");
        }
        else {
            pizzaRepository.save(pizza);
            System.out.println("Pizza created...");
        }
    }

    @Override
    public Pizza modifyPizza(Pizza pizza) {
        Optional<Pizza> optionalPizza = pizzaRepository.findById(pizza.getPizzaNumber());
        if(optionalPizza.isPresent()) {

            pizzaRepository.save(pizza);
            System.out.println("Pizza modified...");
        }
        else {
            throw new RuntimeException("Pizza not found ...");
        }
        return pizza;
    }

    @Override
    public void deletePizza(int id) {
        Optional<Pizza> optionalPizza = pizzaRepository.findById(id);
        if(optionalPizza.isPresent()) {
            Pizza pizzaToDelete = optionalPizza.get();
            pizzaRepository.delete(pizzaToDelete);
            System.out.println("Pizza deleted...");
        }
        else {
            throw new PizzaNotFoundException("Pizza not found ...");
        }
    }

    
}
