package com.example.demo;

import com.example.demo.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface DatabaseRepository extends CrudRepository<Message, Integer>
{

}

