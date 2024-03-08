package org.my.calendarcore.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.my.calendarcore.domain.entity.Scheduel;
import org.my.calendarcore.domain.entity.User;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class Notification {

    private Scheduel scheduel;

    public Notification(Scheduel scheduel) {
        this.scheduel = scheduel;
    }
}
