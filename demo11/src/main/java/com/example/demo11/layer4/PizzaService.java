package com.example.demo11.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo11.layer2.Pizza;

@Service
public interface PizzaService {
    
    Pizza orderingAPizza(int id);
	List<Pizza> getAllPizzas();
	
	void createPizza(Pizza pizza) throws PizzaAlreadyExistException;
	Pizza modifyPizza(Pizza pizza);
	void  deletePizza(int id);
}
