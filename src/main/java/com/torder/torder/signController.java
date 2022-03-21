package com.torder.torder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class signController {
    
    @GetMapping("/sign")
    public Sign sign(@RequestParam(name = "name", required = false, defaultValue = "Hi") String name, Model model){
        model.addAttribute("name", name); 

        return "sign";
    }
}
