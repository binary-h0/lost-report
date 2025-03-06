package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AlarmRequested extends AbstractEvent {

    private Long id;

    public AlarmRequested(FindManage aggregate) {
        super(aggregate);
    }

    public AlarmRequested() {
        super();
    }
}
//>>> DDD / Domain Event
