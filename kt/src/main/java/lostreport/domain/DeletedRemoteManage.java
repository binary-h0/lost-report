package lostreport.domain;

import java.util.*;
import lombok.*;
import lostreport.domain.*;
import lostreport.infra.AbstractEvent;

@Data
@ToString
public class DeletedRemoteManage extends AbstractEvent {

    private Long id;
}
