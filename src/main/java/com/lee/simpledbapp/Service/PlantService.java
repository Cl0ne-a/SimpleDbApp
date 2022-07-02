package com.lee.simpledbapp.Service;

import com.lee.simpledbapp.Model.PlantDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantService extends JpaRepository<PlantDto, Integer> {
}
