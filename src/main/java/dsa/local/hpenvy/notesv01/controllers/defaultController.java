package dsa.local.hpenvy.notesv01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notesv01")
public class defaultController {

    @GetMapping("/home")
    public String homeMethod() {
        return "home";
    }
    
}
