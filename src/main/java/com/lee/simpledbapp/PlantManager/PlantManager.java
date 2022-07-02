package com.lee.simpledbapp.PlantManager;

import com.lee.simpledbapp.Model.PlantDto;

import java.util.List;

public interface PlantManager {
    PlantDto addPlant(PlantDto plantDto);
    List<PlantDto> allPlants();
}
