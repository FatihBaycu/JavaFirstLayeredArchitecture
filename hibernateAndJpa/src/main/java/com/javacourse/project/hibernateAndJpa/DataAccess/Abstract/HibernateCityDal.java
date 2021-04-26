package com.javacourse.project.hibernateAndJpa.DataAccess.Abstract;

import com.javacourse.project.hibernateAndJpa.Entities.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
//JPA=>VERİ ERİŞİM TEKNİĞİ
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateCityDal implements ICityDal {

    private EntityManager entityManager;
    @Autowired
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<City> getAll() {
        Session session= entityManager.unwrap(Session.class);
        @SuppressWarnings("unchecked")
		List<City> cities=session.createQuery("from City").getResultList();
        return cities;
    }

    @Override
    public City getById() {
        return null;
    }

    @Override
    @Transactional
    public void add(City city) {
        Session session=entityManager.unwrap(Session.class);
            session.save(city);
            session.getTransaction().commit();
    }

    @Override
    public void update(City city) {

    }

    @Override
    public void delete(City city) {

    }


}
