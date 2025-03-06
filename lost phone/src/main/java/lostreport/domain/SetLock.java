package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SetLock extends AbstractEvent {

    private Long id;

    public SetLock(Phone aggregate) {
        super(aggregate);
    }

    public SetLock() {
        super();
    }
}
//>>> DDD / Domain Event
