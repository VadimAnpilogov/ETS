package petProject.ETS.TaskInterface.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import petProject.ETS.TaskInterface.model.Task;
import petProject.ETS.TaskInterface.repository.TaskRepository;
import petProject.ETS.TaskInterface.service.TaskService;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class TaskServiceImpl implements TaskService {


    private final TaskRepository repository;
    @Override
    public List<Task> findAllTask() {
        return repository.findAll();
    }

    @Override
    public Task createTask(Task task) {
        task.setCreatedDate(new Date());
        return repository.save(task);
    }
}
