package petProject.ETS.EventInterface.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import petProject.ETS.EventInterface.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
