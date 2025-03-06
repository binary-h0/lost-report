package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FindRequested extends AbstractEvent {

    public FindRequested(FindManage aggregate) {
        super(aggregate);
    }

    public FindRequested() {
        super();
    }
}
//>>> DDD / Domain Event
