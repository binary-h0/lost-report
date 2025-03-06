package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ChangedLostDeviceStatus extends AbstractEvent {

    private Long id;

    public ChangedLostDeviceStatus(DeviceManage aggregate) {
        super(aggregate);
    }

    public ChangedLostDeviceStatus() {
        super();
    }
}
//>>> DDD / Domain Event
