package lostreport.infra;

import lostreport.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerManageHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CustomerManage>> {

    @Override
    public EntityModel<CustomerManage> process(
        EntityModel<CustomerManage> model
    ) {
        return model;
    }
}
