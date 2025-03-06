package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TmpPhoneRequested extends AbstractEvent {

    private Long id;

    public TmpPhoneRequested(FindManage aggregate) {
        super(aggregate);
    }

    public TmpPhoneRequested() {
        super();
    }
}
//>>> DDD / Domain Event
