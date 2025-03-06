package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class UpdatedPhoneStatus extends AbstractEvent {

    private Long id;

    public UpdatedPhoneStatus(RemoteManage aggregate) {
        super(aggregate);
    }

    public UpdatedPhoneStatus() {
        super();
    }
}
//>>> DDD / Domain Event
