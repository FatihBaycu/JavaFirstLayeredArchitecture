package com.javacourse.project.hibernateAndJpa.Business.Concrete;

import com.javacourse.project.hibernateAndJpa.Business.Abstract.ICityService;
import com.javacourse.project.hibernateAndJpa.DataAccess.Abstract.ICityDal;
import com.javacourse.project.hibernateAndJpa.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CityManager implements ICityService {

    private ICityDal _iCityDal;

    @Autowired
    public CityManager(ICityDal iCityDal) {
        this._iCityDal = iCityDal;
    }


    @Override
    @Transactional
    public List<City> getAll() {
        return _iCityDal.getAll();
    }

    @Override
    @Transactional
    public City getById() {
        return null;
    }

    @Override
    @Transactional
    public void add(City city) {

    }

    @Override
    @Transactional
    public void update(City city) {

    }

    @Override
    @Transactional
    public void delete(City city) {

    }
}
