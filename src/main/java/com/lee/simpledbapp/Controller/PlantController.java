package com.lee.simpledbapp.Controller;

import com.lee.simpledbapp.Model.PlantDto;
import com.lee.simpledbapp.PlantManager.PlantManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/")
public class PlantController {

	private final PlantManager plantManager;

	@GetMapping("plants")
	public ResponseEntity<List<PlantDto>> plants() {
		return new ResponseEntity<>(plantManager.allPlants(), HttpStatus.OK);
	}

	@PostMapping(path = "newbie",
	consumes = MediaType.APPLICATION_JSON_VALUE,
	produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PlantDto> savePlant(@RequestBody PlantDto plantDto) {
		PlantDto newPlant = plantManager.addPlant(plantDto);
		if(plantDto == null) {
			try {
				throw new ServerException("plant was not passed");
			} catch (ServerException e) {
				throw new RuntimeException(e);
			}
		} else return new ResponseEntity<>(newPlant, HttpStatus.CREATED);
	}

//	@GetMapping("plants")
//	public String plants(Model model) {
//		model.addAttribute("plants", plantManager.allPlants());
//		return "plants";
//	}
//
//	@PostMapping("plants/newbie")
//	public String saveNewPLant(
//			@ModelAttribute
//			PlantDto newbie,
//			Model model) {
//
//		plantManager.addPlant(newbie);
//		model.addAttribute("newbie", newbie);
//
//		return "newbie";
//	}
}
