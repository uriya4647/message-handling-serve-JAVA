package com.example.demo.message;

public class Message {

    private String originalMessage;
    private String type;
    private int convertedMessage;
     
    public Message(String originalMessage) {
        this.originalMessage = originalMessage;
    }

    public Message(String originalMessage, int convertedMessage) {
        this.originalMessage = originalMessage;
        this.convertedMessage = convertedMessage;
    }

    public Message(String originalMessage,String type) {
        this.originalMessage = originalMessage;
    
          this.type = type;
    }
    
    public Message(String originalMessage, String type, int convertedMessage) {
        this.originalMessage = originalMessage;
        this.type = type;
        this.convertedMessage = convertedMessage;
    }

  

    public String getOriginalMessage() {
        return originalMessage;
    }

    public void setOriginalMessage(String originalMessage) {
        this.originalMessage = originalMessage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getConvertedMessage() {
        return convertedMessage;
    }

    public void setConvertedMessage(int convertedMessage) {
        this.convertedMessage = convertedMessage;
    }
}

  


  


    



    

    

