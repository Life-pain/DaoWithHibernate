package com.example.daowithhibernate.Repository;

import com.example.daowithhibernate.Entity.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DaoRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city) {
        Query query = entityManager.createNativeQuery(
                "select * from persons where city_of_living like :city")
                .setParameter("city", city);
        return query.getResultList();
    }
}
