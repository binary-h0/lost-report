package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RegisteredDevice extends AbstractEvent {

    private Long id;

    public RegisteredDevice(DeviceManage aggregate) {
        super(aggregate);
    }

    public RegisteredDevice() {
        super();
    }
}
//>>> DDD / Domain Event
