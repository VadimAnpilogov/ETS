package petProject.ETS.EventInterface.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import petProject.ETS.EventInterface.model.Event;
import petProject.ETS.EventInterface.service.EventService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestEventController {

    private final EventService service;

    @GetMapping("api/findAllEvent")
    private List<Event> findAllEvent(){
        return service.findAllEvent();
    }
}
