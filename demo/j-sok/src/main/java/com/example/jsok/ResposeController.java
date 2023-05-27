package com.example.jsok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import retrofit2.http.Path;

@Controller
@RequestMapping("/response")
@CrossOrigin(origins = "http://localhost:3000")
public class ResposeController
{
    @Autowired
    private ResponseRepository responseRepository;

    @GetMapping("/responseMessage")
    public @ResponseBody Iterable<Response> getAllResponses()
    {
        return responseRepository.findAll();
    }

    @DeleteMapping("/responseMessage/{id}")
    public ResponseEntity<Integer> deleteResponse(@PathVariable Integer id)
    {
        responseRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
