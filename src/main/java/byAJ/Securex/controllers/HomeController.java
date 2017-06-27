package byAJ.Securex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, Principal principal){

        return "login";
    }

}
