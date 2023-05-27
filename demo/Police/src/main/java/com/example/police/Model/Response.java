package com.example.police.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Response
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;
    Integer idmessage;
    String ResponseMess;


    public int getId() {
        return id;
    }

    public String getResponseMess() {
        return ResponseMess;
    }

    public Integer getIdmessage() {
        return idmessage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setResponseMess(String responseMess) {
        ResponseMess = responseMess;
    }

    public void setIdmessage(Integer idmessage) {
        this.idmessage = idmessage;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", ResponseMess='" + ResponseMess + '\'' +
                ", idmessage=" + idmessage +
                '}';
    }










}
