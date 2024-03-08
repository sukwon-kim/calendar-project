package org.my.calendarcore.domain.entity;

import lombok.*;
import org.my.calendarcore.domain.Event;
import org.my.calendarcore.domain.Notification;
import org.my.calendarcore.domain.ScheduelType;
import org.my.calendarcore.domain.Task;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "scheduels")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(access = AccessLevel.PRIVATE)
public class Scheduel extends BaseEntity{

    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String title;
    private String description;

    @JoinColumn(name = "writer_id")
    @ManyToOne
    private User writer;

    @Enumerated(EnumType.STRING)
    private ScheduelType scheduelType;

    private LocalDateTime createdAt = LocalDateTime.now();

    public Task toTask(){
        return new Task();
    }

    public Event toEvent(){
        return new Event();
    }

    public Notification toNotification(){
        return new Notification();
    }

    public static Scheduel event(
            String title,
            String description,
            LocalDateTime startAt,
            LocalDateTime endAt,
            User writer){
        return Scheduel.builder()
                .title(title)
                .description(description)
                .startAt(startAt)
                .endAt(endAt)
                .writer(writer)
                .scheduelType(ScheduelType.EVENT)
                .build();
    }

    public static Scheduel task(
            String title,
            String description,
            LocalDateTime taskAt,
            User writer){
        return Scheduel.builder()
                .title(title)
                .description(description)
                .startAt(taskAt)
                .writer(writer)
                .scheduelType(ScheduelType.TASK)
                .build();
    }

    public static Scheduel notification(
            String title,
            LocalDateTime notifyAt,
            User writer){
        return Scheduel.builder()
                .title(title)
                .startAt(notifyAt)
                .writer(writer)
                .scheduelType(ScheduelType.NOTIFICATION)
                .build();
    }
}
