package edu.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.learning.employee.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
