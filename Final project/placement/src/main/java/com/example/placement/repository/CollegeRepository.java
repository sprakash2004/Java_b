package com.example.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.placement.entity.College;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
