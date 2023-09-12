package com.example.demo.validations;

import com.example.demo.utils.Includes;


public class FractionValidation extends Validation {
    
    
    public boolean ValidationType(String message){

        StrValidation strValidation = new StrValidation();
    

        if(message == null || message.isEmpty()) return false;
        
        if(!Includes.includes(message, '/')) return false;

        int indexOfSymbol = Includes.indexOf(message, '/');   
        String strNumerator = message.substring(0, indexOfSymbol);
        String strDenominator = message.substring(indexOfSymbol);
        
        if (!strValidation.ValidationType(strNumerator)) return false;
        if (!strValidation.ValidationType(strDenominator)) return false;
        
         
            
    

            return true;
        };

    
    // private String strNum;
    // private int numerator;
    // private int denominator;


    // public FractionValidation( String strNum) {
    //     this.strNum = strNum;
    // }

    // public String getStrNum() {
    //     return strNum;
    // }

    // public void setStrNum(String strNum) {
    //     this.strNum = strNum;
    // }

    // public int getResultsOfFraction(){

    //     return numerator / denominator;
    // }

  
}



