package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HelloController {

    @GetMapping("hello")
    public String Hello(Model model)
    {
        model.addAttribute("data", "song");
        model.addAttribute("data2", "yang");
        return "hello";
    }
}
