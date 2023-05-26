package com.example.demo.Controller;

import com.example.demo.DatabaseRepository;
import com.example.demo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/SOS")
public class MessageController
{
    @Autowired
    private DatabaseRepository repo;

    @PostMapping("/ticket")
    public @ResponseBody String addNewMessage (@RequestParam String message, @RequestParam String type, @RequestParam String Destination, @RequestParam Integer Prio)
    {
        Message m = new Message();
        m.setMessage(message);
        m.setType(type);
        m.setDestination(Destination);
        m.setPrio(1);
        return "saved";
    }

    @GetMapping("/ticket")
    public @ResponseBody Iterable<Message> getAllMessage()
    {
        return repo.findAll();
    }

}
