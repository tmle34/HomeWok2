package com.example.demo.Models;

import com.example.demo.Models.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepo extends CrudRepository<Items,Integer> {
}
