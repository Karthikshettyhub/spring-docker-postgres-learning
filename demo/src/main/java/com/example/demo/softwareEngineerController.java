package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class softwareEngineerController {
    @GetMapping
    public List<softwareEngineer> getengineers(){
        return List.of(
                new softwareEngineer(1,
                "karthik",
                "java,sping"
                ),
                new softwareEngineer(2,
                        "ramesh",
                        "java,sping"
                )
        );


    }

}
