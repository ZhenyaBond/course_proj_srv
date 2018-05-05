package com.bond.pickmark.server.repository;

import com.bond.pickmark.server.entity.Places;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlacesRepository extends JpaRepository<Places,Long> {
}
