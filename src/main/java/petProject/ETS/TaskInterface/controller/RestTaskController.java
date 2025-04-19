package petProject.ETS.TaskInterface.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import petProject.ETS.TaskInterface.model.Task;
import petProject.ETS.TaskInterface.service.TaskService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestTaskController {

    private final TaskService service;

    @GetMapping("api/findAllTask")
    public List<Task> findAllTask(){
        return service.findAllTask();
    }

}
