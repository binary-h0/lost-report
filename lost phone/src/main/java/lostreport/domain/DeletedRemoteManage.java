package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeletedRemoteManage extends AbstractEvent {

    private Long id;

    public DeletedRemoteManage(RemoteManage aggregate) {
        super(aggregate);
    }

    public DeletedRemoteManage() {
        super();
    }
}
//>>> DDD / Domain Event
