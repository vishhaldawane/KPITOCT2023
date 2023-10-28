package com.example.demo11.layer2; //1

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//| pizzaid | pizzatype      | pizzacost |

@Entity
@Table(name="pizza")
public class Pizza //2
{
    @Id
    @Column(name="pizzaid")
    private int pizzaNumber; //3

    @Column(name="pizzatype", length=20)
    private String typeOfPizza;

    @Column(name="pizzacost")  
    private double pizzaPrice;

    public Pizza() { //4 no-arg ctor
        System.out.println("Pizza created...");
    }
    //5

    public int getPizzaNumber() {
        return pizzaNumber;
    }

    public void setPizzaNumber(int pizzaNumber) {
        this.pizzaNumber = pizzaNumber;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    @Override
    public String toString() {
        return "Pizza [pizzaNumber=" + pizzaNumber + ", typeOfPizza=" + typeOfPizza + ", pizzaPrice=" + pizzaPrice
                + "]";
    }
    
    
}