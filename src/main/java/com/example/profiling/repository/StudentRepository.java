package com.example.profiling.repository;

import com.example.profiling.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom query methods (if needed)
    Student findByEmail(String email);
}
