package petProject.ETS.TaskInterface.service;

import petProject.ETS.TaskInterface.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAllTask();
    Task createTask(Task task);
}
