package com.example.jsok;

import com.example.jsok.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/SOS")
public class MessageController
{
    @Autowired
    private MessageRepository messageRepository;

    @PostMapping("/ticket")
    public @ResponseBody String addNewMessage (@RequestParam String message, @RequestParam String type, @RequestParam String Destination)
    {
        Message m = new Message();
        m.setMessage(message);
        m.setType(type);
        m.setDestination(Destination);
        m.setPrio(1);
        messageRepository.save(m);
        return "saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Message> getAllMessage(){
        return messageRepository.findAll();
    }


}
