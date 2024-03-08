import org.junit.jupiter.api.Test;
import org.my.calendarcore.domain.ScheduelType;
import org.my.calendarcore.domain.entity.Engagement;
import org.my.calendarcore.domain.Event;
import org.my.calendarcore.domain.RequestStatus;
import org.my.calendarcore.domain.entity.Scheduel;
import org.my.calendarcore.domain.entity.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomainCreateTest {

/*
    @Test
    void eventCreate(){
        final User writer = new User("writer", "email@email.com", "password", LocalDate.now());
        final User attendee = new User("attendee", "email@email.com", "password", LocalDate.now());
        final Event event = new Event(
                LocalDateTime.now(),
                LocalDateTime.now(),
                "title",
                "description",
                writer,
                LocalDateTime.now()
        );

        event.addEngagement(new Engagement(event, attendee, LocalDateTime.now(), RequestStatus.REQUESTED));
        assertEquals(event.getEngagements().get(0).getEvent().getWriter().getName(), "writer");
    }
*/

    @Test
    void eventCreat(){
        final User me = new User("name", "email", "pw", LocalDate.now());
        final Scheduel taskScheduel = Scheduel.task("할일", "청소하기", LocalDateTime.now(), me);

        assertEquals(taskScheduel.getScheduelType(), ScheduelType.TASK);
        assertEquals(taskScheduel.getTitle(), "할일");
    }

}
