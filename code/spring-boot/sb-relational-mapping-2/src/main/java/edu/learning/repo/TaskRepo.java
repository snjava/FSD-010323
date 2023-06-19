package edu.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.learning.entity.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer> {

}
