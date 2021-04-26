package com.javacourse.project.hibernateAndJpa.RestApi;

import com.javacourse.project.hibernateAndJpa.Business.Abstract.ICityService;
import com.javacourse.project.hibernateAndJpa.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {
    private ICityService _iCityService;

    @Autowired
    public CityController(ICityService iCityService) {
        _iCityService = iCityService;
    }

    @GetMapping("/cities")
    public List<City> getAll(){
        return _iCityService.getAll();
    }

    public void add(City city){
        _iCityService.add(city);
    }

}
