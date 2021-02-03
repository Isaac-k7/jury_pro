package ci.oda.jury_pro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageHtml {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
