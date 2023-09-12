package com.example.demo.utils;

public class Includes {

    public static boolean includes(String str , char symbole){

        if(str == null || str.isEmpty()) return false;

        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i) == symbole) return true;
        }

        return false;
    };

    public static int indexOf(String str , char symbole){
        
        if(str == null || str.isEmpty()) return -1;

         for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i) == symbole) return i;
        }

        return -1;

    }

    
    
}
