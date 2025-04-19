package petProject.ETS.EventInterface.service.imlp;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import petProject.ETS.EventInterface.model.Event;
import petProject.ETS.EventInterface.repository.EventRepository;
import petProject.ETS.EventInterface.service.EventService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class EventServiceImpl implements EventService {

    private final EventRepository repository;
    @Override
    public List<Event> findAllEvent() {
        return repository.findAll();
    }

    @Override
    public Event createEvent(Event event) {
        return repository.save(event);
    }
}
