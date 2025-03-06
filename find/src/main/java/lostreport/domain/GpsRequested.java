package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class GpsRequested extends AbstractEvent {

    private Long id;

    public GpsRequested(FindManage aggregate) {
        super(aggregate);
    }

    public GpsRequested() {
        super();
    }
}
//>>> DDD / Domain Event
