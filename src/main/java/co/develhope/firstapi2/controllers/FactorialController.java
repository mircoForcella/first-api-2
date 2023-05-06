package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @GetMapping
    public int getFactorial(@RequestParam int n){
        int i;
        int f = 1;
        for(i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }

}
