package com.example.placement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placement.entity.College;
import com.example.placement.repository.CollegeRepository;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    // Create
    public College addCollege(College college) {
        return collegeRepository.save(college);
    }

    // Read
    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    // Update
    public College updateCollege(College college) {
        if (collegeRepository.existsById(college.getId())) {
            return collegeRepository.save(college);
        }
        return null;
    }

    // Delete
    public void deleteCollege(Long id) {
        collegeRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return collegeRepository.existsById(id);
    }
}
