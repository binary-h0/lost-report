package lostreport.infra;

import lostreport.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DeviceManageHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DeviceManage>> {

    @Override
    public EntityModel<DeviceManage> process(EntityModel<DeviceManage> model) {
        return model;
    }
}
