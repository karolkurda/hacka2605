package com.example.jsok;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.property.access.internal.PropertyAccessStrategyNoopImpl;

@Entity
public class Response
{
    @Id
    private Integer Id;
    private String message;
    private Integer MessageId;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getMessageId() {
        return MessageId;
    }

    public void setMessageId(Integer MessageId) {
        this.MessageId = MessageId;
    }



}
