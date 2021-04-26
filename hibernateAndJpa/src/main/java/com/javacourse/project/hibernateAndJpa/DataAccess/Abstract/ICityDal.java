package com.javacourse.project.hibernateAndJpa.DataAccess.Abstract;
import com.javacourse.project.hibernateAndJpa.Entities.City;
import java.util.List;


public interface ICityDal {

	List<City> getAll();
	City getById();
	void add(City city);
	void update(City city);
	void delete(City city);

	

}
