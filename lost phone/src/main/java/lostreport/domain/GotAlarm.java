package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class GotAlarm extends AbstractEvent {

    private Long id;

    public GotAlarm(Phone aggregate) {
        super(aggregate);
    }

    public GotAlarm() {
        super();
    }
}
//>>> DDD / Domain Event
