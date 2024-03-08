package org.my.calendarcore.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.my.calendarcore.domain.entity.Scheduel;
import org.my.calendarcore.domain.entity.User;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class Task {

    private Scheduel scheduel;

    public Task(Scheduel scheduel) {
        this.scheduel = scheduel;
    }
}
