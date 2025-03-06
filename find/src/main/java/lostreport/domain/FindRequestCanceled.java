package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FindRequestCanceled extends AbstractEvent {

    private Long id;

    public FindRequestCanceled(FindManage aggregate) {
        super(aggregate);
    }

    public FindRequestCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
