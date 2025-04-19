package petProject.ETS.EventInterface.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdDate;
    private Date updateDate;
    private String name;
    private String description;
    private LocalDateTime dateTimeEvent; //Дата и время события
    private String time; //Продолжительность события

}
