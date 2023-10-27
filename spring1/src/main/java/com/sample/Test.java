package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class Test
{
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mySpringSample.xml");
        System.out.println("ctx is ready "+ctx);

        PizzaController pizzaController = ctx.getBean(PizzaController.class);
        pizzaController.takeOrder();
    }
}
@Component
class Pizza { //pojo interacts with DB
    Pizza() {
        System.out.println("Pizza() ");
    }
    void typeOfPizza(String typeOfPizza) {
        System.out.println("Pizza : A particular type of pizza is created ..."+typeOfPizza);
    }
}

@Repository //means below class is responsible for CRUD opeartion
class PizzaRepository { //interacts with Pojo and Service layers
    
    @Autowired
    Pizza pizza;
        

    PizzaRepository() {
        System.out.println("PizzaRepository() ");
    }
    void makingThePizza() {
        System.out.println("PizzaRepository : Making the pizza....");
        
        pizza.typeOfPizza("Veg Extravaganza");
    }
}

@Service //below class is responsible for businesss logic of your project
        //interacts with Repositories and Controllers
class PizzaService {

    @Autowired
    PizzaRepository pizzaRepository ;


    PizzaService() {
        System.out.println("PizzaService() ");
    }
    void serveThePizza() {
       
        System.out.println("PizzaService : is serving the pizza..");
        
        
        pizzaRepository.makingThePizza();
    }
}

@Controller //responsible for delegating calls from angular/react/any front end and talk to service layer
class PizzaController {
    
    @Autowired //internally identifies the predefined object and injects 
            //it to the below variable - automagical feature of spring
    PizzaService pizzaService;

    PizzaController() {
        System.out.println("PizzaController() ");
    }

    void takeOrder() {
        System.out.println("PizzaController : is taking pizza's order....");
        pizzaService.serveThePizza();
    }
}