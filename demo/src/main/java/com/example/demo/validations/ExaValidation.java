package com.example.demo.validations;

public class ExaValidation extends Validation {

        public boolean ValidationType(String message){

            if(message == null || message.isEmpty()) return false;

            for (int i = 0; i < message.length(); i++) {

                char indexStr = message.charAt(i);

                if(indexStr < '0' && indexStr > '9' || indexStr < 'A' && indexStr > 'F'  || (indexStr < 'a' && indexStr > 'f')){
                   
                    return false;
                }
            

            }



            return true;

        };

        


    
}
