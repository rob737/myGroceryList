package com.verticalScale.myGroceryList.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryListDao extends CrudRepository<Object, Long> {

    @Override
    Iterable<Object> findAllById(Iterable<Long> var1);

}
