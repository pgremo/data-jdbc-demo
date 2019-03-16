package com.jdbc.demo;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ItemRepository extends CrudRepository<Item, UUID> {
    @Query("select i.upc, d.description from item i join item_detail d on i.upc = d.upc")
    @Override
    Iterable<Item> findAll();
}
