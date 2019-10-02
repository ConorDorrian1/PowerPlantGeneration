package com.masters.generation.plantgeneration.Models;

import javax.persistence.*;

@Entity
@Table(name = "powergeneration") //which takes some values like the name you are going to name your table
public class PowerGeneration {

    @Id   //denotes that the id is the primary key / identifying key for this table
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String plantName;
    private String primaryFuel;
    private String otherFuel;

    public PowerGeneration (){}

    public PowerGeneration(String plantName, String primaryFuel, String otherFuel) {
        this.plantName = plantName;
        this.primaryFuel = primaryFuel;
        this.otherFuel = otherFuel;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getPrimaryFuel() {
        return primaryFuel;
    }

    public void setPrimaryFuel(String primaryFuel) {
        this.primaryFuel = primaryFuel;
    }

    public String getOtherFuel() {
        return otherFuel;
    }

    public void setOtherFuel(String otherFuel) {
        this.otherFuel = otherFuel;
    }

    @Override
    public String toString() {
        return "PowerGeneration{" +
                "Id=" + Id +
                ", plantName='" + plantName + '\'' +
                ", primaryFuel='" + primaryFuel + '\'' +
                ", otherFuel='" + otherFuel + '\'' +
                '}';
    }
}
