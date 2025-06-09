package com.korit.springboot.repository;

import com.korit.springboot.domain.dto.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    void deleteById(Integer id);
}
