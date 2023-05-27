package com.example.police;

import com.example.police.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {

}
