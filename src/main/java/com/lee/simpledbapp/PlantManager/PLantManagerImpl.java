package com.lee.simpledbapp.PlantManager;

import com.lee.simpledbapp.Model.PlantDto;
import com.lee.simpledbapp.Service.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PLantManagerImpl implements PlantManager{

    private final PlantService plantService;

    @Override
    public PlantDto addPlant(PlantDto plantDto) {
        return plantService.save(plantDto);
    }

    @Override
    public List<PlantDto> allPlants() {
        return plantService.findAll();
    }
}
