package petProject.ETS.TaskInterface.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdDate;
    private Date updateDate;
    private Date resolutionDate;
    private String name;
    private String description;
    private LocalDateTime dueDateTime;
    private String time;
    private Integer numPriority;
    private Boolean completed;
//    private String status;
//    private String project;

}
