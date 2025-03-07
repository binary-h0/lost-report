package lostreport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FindRequested extends AbstractEvent {

    private String id;
    private String userId;
    private String imei;
    private String gps;
    private String lockState;
    private String status;
    private Date lostAt;
    private String tmpPhoneImei;
    private String tmpPhoneStatus;

    public FindRequested(FindManage aggregate) {
        super(aggregate);
    }

    public FindRequested() {
        super();
    }
}
//>>> DDD / Domain Event
