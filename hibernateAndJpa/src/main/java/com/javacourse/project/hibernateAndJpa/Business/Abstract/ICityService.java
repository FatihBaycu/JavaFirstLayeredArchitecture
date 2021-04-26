package com.javacourse.project.hibernateAndJpa.Business.Abstract;
import com.javacourse.project.hibernateAndJpa.Entities.City;

import java.util.List;

public interface ICityService {

    List<City> getAll();
    City getById();
    void add(City city);
    void update(City city);
    void delete(City city);
}
