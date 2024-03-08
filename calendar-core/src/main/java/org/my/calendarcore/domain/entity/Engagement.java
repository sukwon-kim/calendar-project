package org.my.calendarcore.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.my.calendarcore.domain.RequestStatus;
import org.my.calendarcore.domain.Event;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "engagements")
public class Engagement extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "scheduel_id")
    private Scheduel scheduel;

    @ManyToOne
    @JoinColumn(name = "attendee_id")
    private User attendee;
    private LocalDateTime createdAt;
    private RequestStatus requestStatus;

}
