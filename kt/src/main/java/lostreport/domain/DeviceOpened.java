package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeviceOpened extends AbstractEvent {

    private Long id;

    public DeviceOpened(CustomerManage aggregate) {
        super(aggregate);
    }

    public DeviceOpened() {
        super();
    }
}
//>>> DDD / Domain Event
