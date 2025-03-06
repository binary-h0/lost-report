package lostreport.domain;

import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

@Data
@ToString
public class CreatedRemoteManage extends AbstractEvent {

    private String imei;
    private String userName;
    private String status;
    private String gps;
    private Boolean lock;
    private Boolean alarm;
}
