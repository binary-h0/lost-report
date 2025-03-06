package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class LockRequested extends AbstractEvent {

    private Long id;

    public LockRequested(FindManage aggregate) {
        super(aggregate);
    }

    public LockRequested() {
        super();
    }
}
//>>> DDD / Domain Event
