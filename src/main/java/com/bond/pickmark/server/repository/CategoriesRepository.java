package com.bond.pickmark.server.repository;

import com.bond.pickmark.server.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriesRepository extends JpaRepository<Categories,Long> {
}
