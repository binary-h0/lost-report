package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CreatedTmpPhone extends AbstractEvent {

    private Long id;

    public CreatedTmpPhone(CustomerManage aggregate) {
        super(aggregate);
    }

    public CreatedTmpPhone() {
        super();
    }
}
//>>> DDD / Domain Event
