package com.example.demo11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo11.layer2.Pizza;
import com.example.demo11.layer3.PizzaRepository;

@SpringBootTest
class PizzaRepositoryTests {

	@Autowired //spring's concern to bring the implementation object to below ref
	PizzaRepository pizzaRepository;

	//SimpleJpaRepositoryImpl

	@Test
	void showAllPizzas() {
		ArrayList<Pizza> coll = (ArrayList<Pizza>) pizzaRepository.findAll();

		Iterator<Pizza> iterator = coll.iterator();
		while(iterator.hasNext()) {
			Pizza thePizza = iterator.next();
			System.out.println("Pizza : "+thePizza);
		}
	}

	@Test
	public void showSinglePizza() {


		Optional<Pizza> optional = pizzaRepository.findById(10);

		if(optional.isPresent()) {
			Pizza pizza = optional.get();
			System.out.println("pizza "+pizza);
		}
		else {
			throw new RuntimeException("Pizza not found ");
		}
	}

	@Test
	public void insertPizzaTest() {
		Pizza pizza = new Pizza();
		pizza.setPizzaNumber(6);
		pizza.setTypeOfPizza("CHEESE");		
		pizza.setPizzaPrice(333);

		pizzaRepository.save(pizza);
	}

	@Test
	public void updatePizzaTest() {

		Optional<Pizza> optionalPizza = pizzaRepository.findById(6);
		if(optionalPizza.isPresent()) {
			Pizza pizza = optionalPizza.get();
			pizza.setTypeOfPizza("CHEESE PIZZA");		
			pizza.setPizzaPrice(444);
			pizzaRepository.save(pizza);
			System.out.println("Pizza modified...");
		}
		else {
			throw new RuntimeException("Pizza not found to modify..");
		}
	}

	@Test
	public void deletePizzaTest() {

		Optional<Pizza> optionalPizza = pizzaRepository.findById(6);
		if(optionalPizza.isPresent()) {
			Pizza pizza = optionalPizza.get();
			pizzaRepository.delete(pizza);
			System.out.println("Pizza deleted...");
		}
		else {
			throw new RuntimeException("Pizza not found to delete..");
		}
	}

}
