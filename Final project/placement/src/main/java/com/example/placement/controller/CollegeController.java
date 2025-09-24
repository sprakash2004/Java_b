package com.example.placement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.placement.entity.College;
import com.example.placement.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    // Create
    @PostMapping("/add")
    public College addCollege(@RequestBody College college) {
        return collegeService.addCollege(college);
    }

    // Read
    @GetMapping("/all")
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }

    // Update
    @PutMapping("/update")
    public ResponseEntity<?> updateCollege(@RequestBody College college) {
        if (collegeService.existsById(college.getId())) {
            College updatedCollege = collegeService.updateCollege(college);
            return ResponseEntity.ok(updatedCollege);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("College with ID " + college.getId() + " not found.");
        }
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCollege(@PathVariable Long id) {
        if (collegeService.existsById(id)) {
            collegeService.deleteCollege(id);
            return ResponseEntity.ok("College deleted successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("College with ID " + id + " not found.");
        }
    }
}
