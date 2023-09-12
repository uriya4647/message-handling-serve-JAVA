package com.example.demo.message;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/message")
public class MessageController {

    @PostMapping  
    @ResponseBody
        
            public ResponseEntity<String> postNewMessage(@RequestBody String requestObject ){
            return ResponseEntity.ok(
                "yes" + requestObject);
            }

        }
