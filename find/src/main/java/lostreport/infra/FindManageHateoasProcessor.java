package lostreport.infra;

import lostreport.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FindManageHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FindManage>> {

    @Override
    public EntityModel<FindManage> process(EntityModel<FindManage> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/findrequest")
                .withRel("findrequest")
        );

        return model;
    }
}
