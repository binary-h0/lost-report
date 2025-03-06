package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CreatedRemoteManage extends AbstractEvent {

    private Long id;

    public CreatedRemoteManage(RemoteManage aggregate) {
        super(aggregate);
    }

    public CreatedRemoteManage() {
        super();
    }
}
//>>> DDD / Domain Event
