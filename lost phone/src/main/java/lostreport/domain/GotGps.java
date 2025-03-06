package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class GotGps extends AbstractEvent {

    private Long id;

    public GotGps(Phone aggregate) {
        super(aggregate);
    }

    public GotGps() {
        super();
    }
}
//>>> DDD / Domain Event
