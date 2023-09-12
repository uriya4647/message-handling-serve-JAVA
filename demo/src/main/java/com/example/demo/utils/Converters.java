package com.example.demo.utils;

public class Converters {


    public long convertExaStrToNumber( String str){

   

        return Long.parseLong( str, 16);

    }

    public long convertStringToNumber(String str){

        return Long.parseLong(str);
    }
    


    
}
