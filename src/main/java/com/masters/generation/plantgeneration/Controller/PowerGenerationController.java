package com.masters.generation.plantgeneration.Controller;

import com.masters.generation.plantgeneration.Models.PowerGeneration;
import com.masters.generation.plantgeneration.Repository.PlantGenerationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/power")
public class PowerGenerationController {

    @Autowired
    PlantGenerationRepository powergeneration;

    @RequestMapping("/{id}")
    public PowerGeneration pg(@PathVariable("id") Integer Id) {
        return new PowerGeneration(Id, 26435);
    }

    @GetMapping("/generation") //get all details
    public List<PowerGeneration> getAllPlants() {
        return powergeneration.findAll();
    }
}
