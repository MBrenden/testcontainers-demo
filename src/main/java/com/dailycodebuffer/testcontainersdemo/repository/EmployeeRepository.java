package com.dailycodebuffer.testcontainersdemo.repository;

import com.dailycodebuffer.testcontainersdemo.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
