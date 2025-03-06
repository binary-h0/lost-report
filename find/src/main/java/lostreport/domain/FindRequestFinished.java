package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FindRequestFinished extends AbstractEvent {

    private Long id;

    public FindRequestFinished(FindManage aggregate) {
        super(aggregate);
    }

    public FindRequestFinished() {
        super();
    }
}
//>>> DDD / Domain Event
