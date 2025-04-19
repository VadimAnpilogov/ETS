package petProject.ETS.EventInterface.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import petProject.ETS.EventInterface.model.Event;
import petProject.ETS.EventInterface.service.EventService;

@Controller
@RequiredArgsConstructor
public class WebEventController {

    private final EventService service;

    @GetMapping("EventUser")
    public String PageEventInterface(){
        return "main/pages/eventInterface.html";
    }

    @PostMapping("newEvent")
    public String createEvent(Event event){
        service.createEvent(event);
        return "redirect:/EventUser";
    }
}
