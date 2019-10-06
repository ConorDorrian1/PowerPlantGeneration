package com.masters.generation.plantgeneration.Controller;

import com.masters.generation.plantgeneration.Models.PowerGeneration;
import com.masters.generation.plantgeneration.Repository.PlantGenerationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PowerGenerationController {

    @Autowired
    PlantGenerationRepository powergeneration;

    @GetMapping("/generation") //get all details
    public List<PowerGeneration> getAllPlants() {
        return powergeneration.findAll();
    }
}
