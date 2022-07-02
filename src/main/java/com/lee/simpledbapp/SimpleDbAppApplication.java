package com.lee.simpledbapp;

import com.lee.simpledbapp.Model.PlantDto;
import com.lee.simpledbapp.PlantManager.PLantManagerImpl;
import com.lee.simpledbapp.PlantManager.PlantManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.logging.log4j2.SpringBootConfigurationFactory;

@SpringBootApplication
public class SimpleDbAppApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication
                .run(SimpleDbAppApplication.class, args);
        var manager = ctx.getBean(PlantManager.class);

        PlantDto plantDto1 = new PlantDto(1, "Rose", 1);
        PlantDto plantDto2 = new PlantDto().setName("Macadamie").setHeight(2);
        manager.addPlant(plantDto1);
        manager.addPlant(plantDto2);
    }
}
