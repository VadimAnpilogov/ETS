package petProject.ETS.TaskInterface.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebTaskController {

    @GetMapping("/Tasks")
    public String PageTaskInterface(){

        return "main/pages/taskInterface.html";
    }

}
