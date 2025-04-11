package lk.ijse.TaskManger.service;
import lk.ijse.TaskManger.dto.TaskDTO;
import java.util.List;

public interface TaskService {
    List<TaskDTO> getAllTasks();
    List<TaskDTO> getTasksByStatus(String status);
    TaskDTO getTaskById(Long id);
    TaskDTO createTask(TaskDTO taskDTO);
    TaskDTO updateTask(Long id, TaskDTO taskDTO);
    void deleteTask(Long id);
}