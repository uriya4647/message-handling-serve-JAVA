package com.example.demo.validations;

 abstract class Validation {

    abstract boolean ValidationType(String message);
   
    public boolean isPositiveNum(int num){

        return num > 0;

    }
    
}
