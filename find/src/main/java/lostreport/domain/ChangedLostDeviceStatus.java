package lostreport.domain;

import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

@Data
@ToString
public class ChangedLostDeviceStatus extends AbstractEvent {

    private String imei;
    private String status;
    private String lostAt;
}
