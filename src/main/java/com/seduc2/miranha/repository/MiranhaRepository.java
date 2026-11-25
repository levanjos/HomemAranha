package com.seduc2.miranha.repository;

import com.seduc2.miranha.entity.Miranha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiranhaRepository extends JpaRepository<Miranha, Integer> {
}
