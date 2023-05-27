package com.example.police;


import com.example.police.Model.Message;
import com.example.police.Model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/PoliceResponse")
public class ResponseController
{
    @Autowired
    private ResponseRepository responseRepository;

    @PostMapping("/response")
    public @ResponseBody String addNewMessage (@RequestParam String message, @RequestParam Integer idmess)
    {
        Response m = new Response();
        m.setResponseMess(message);
        m.setIdmessage(idmess);
        responseRepository.save(m);
        return "saved";
    }


    @GetMapping("/all")
    public @ResponseBody Iterable<Response> addNewMessage(){
        return responseRepository.findAll();
    }

}
