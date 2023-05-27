package com.example.jsok;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message
{
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String message;
    private String type;
    private String Destination;
    private Integer Prio;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public Integer getPrio() {
        return Prio;
    }

    public void setPrio(Integer prio) {
        Prio = prio;
    }




}
