package com.example.demo;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class softwareEngineerController {
    private SoftwareEngineerService softwareEngineerService;

    public softwareEngineerController( SoftwareEngineerService softwareEngineerService) {
          this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getengineers(){
        return softwareEngineerService.getAllSoftwareEngineers();

    }
    @PostMapping
    public void addNewSoftwareengineers(@RequestBody SoftwareEngineer softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);

    }
}
