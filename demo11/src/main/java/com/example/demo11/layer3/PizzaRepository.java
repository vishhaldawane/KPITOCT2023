package com.example.demo11.layer3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo11.layer2.Pizza;

@Repository
public interface PizzaRepository extends
     CrudRepository<Pizza,Integer> {
    //all 12 functions related
    //crud operations are declared
    //in the super interface
}
//and spring will provide
// implementation class known as
//SimpleJpaRepository <-- child of your interface -> PizzaRepository

