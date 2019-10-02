package com.masters.generation.plantgeneration.Repository;

import com.masters.generation.plantgeneration.Models.PowerGeneration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantGenerationRepository extends JpaRepository<PowerGeneration, Integer> {

}
