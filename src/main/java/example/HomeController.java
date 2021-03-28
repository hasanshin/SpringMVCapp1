package example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController  {

    @GetMapping("/helloMVC")
    public String sayHello() {
            return "helloMVC";
        }
}
