package lostreport.infra;

import lostreport.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RemoteManageHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RemoteManage>> {

    @Override
    public EntityModel<RemoteManage> process(EntityModel<RemoteManage> model) {
        return model;
    }
}
