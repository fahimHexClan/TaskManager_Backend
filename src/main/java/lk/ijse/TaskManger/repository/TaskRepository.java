package lk.ijse.TaskManger.repository;

import lk.ijse.TaskManger.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Custom query to find tasks by status
    List<Task> findByStatus(String status);
}
