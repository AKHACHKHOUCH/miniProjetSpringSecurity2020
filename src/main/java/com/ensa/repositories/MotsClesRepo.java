package com.ensa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.entities.MotsCles;

@Repository
public interface MotsClesRepo extends JpaRepository<MotsCles, Long> {

}
