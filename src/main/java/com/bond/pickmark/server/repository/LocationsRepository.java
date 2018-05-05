package com.bond.pickmark.server.repository;

import com.bond.pickmark.server.entity.Locations;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationsRepository extends JpaRepository<Locations,Long> {
}
