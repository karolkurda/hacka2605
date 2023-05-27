package com.example.police;

import com.example.police.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/PoliceMessage")
public class MessageController
{
    @Autowired
    private MessageRepository messageRepository;

//    @PostMapping("/ticket")
//    public @ResponseBody String addNewMessage (@RequestParam String message, @RequestParam String type, @RequestParam String Destination)
//    {
//        Message m = new Message();
//        m.setMessage(message);
//        m.setType(type);
//        m.setDestination(Destination);
//        m.setPrio(1);
//        messageRepository.save(m);
//        return "saved";
//    }

    @DeleteMapping("/Message/{id}")
    public ResponseEntity<Integer> deleteMessage(@PathVariable Integer id)
    {
        messageRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Message> getAllMessage(){
        return messageRepository.findAll();
    }

}
