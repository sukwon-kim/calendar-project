package org.my.calendarcore.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.my.calendarcore.domain.entity.Engagement;
import org.my.calendarcore.domain.entity.Scheduel;
import org.my.calendarcore.domain.entity.User;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@Getter
public class Event {

    private Scheduel scheduel;

    public Event(Scheduel scheduel) {
        this.scheduel = scheduel;
    }
}
