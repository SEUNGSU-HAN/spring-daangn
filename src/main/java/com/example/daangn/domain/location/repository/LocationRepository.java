package com.example.daangn.domain.location.repository;

import com.example.daangn.domain.location.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findBySi(String si);
    List<Location> findBySiAndGugun(String si, String gugun);
}
