package petProject.ETS.TaskInterface.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import petProject.ETS.TaskInterface.model.Task;
import petProject.ETS.TaskInterface.service.TaskService;

@Controller
@RequiredArgsConstructor
public class WebTaskController {
    private final TaskService service;

    @GetMapping("/TaskUser")
    public String PageTaskInterface(){

        return "main/pages/taskInterface.html";
    }


    @PostMapping("/newTask")
    public String createTask(Task task){

        service.createTask(task);
        return "redirect:/TaskUser";
    }

}
