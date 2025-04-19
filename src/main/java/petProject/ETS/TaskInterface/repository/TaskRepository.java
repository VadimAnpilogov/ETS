package petProject.ETS.TaskInterface.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import petProject.ETS.TaskInterface.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
