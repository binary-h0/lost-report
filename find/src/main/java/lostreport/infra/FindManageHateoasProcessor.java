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
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/findrequestcancel"
                )
                .withRel("findrequestcancel")
        );
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/findrequestfinish"
                )
                .withRel("findrequestfinish")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/gpsrequest")
                .withRel("gpsrequest")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/lockrequest")
                .withRel("lockrequest")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/alarmrequest")
                .withRel("alarmrequest")
        );
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() + "/tmpphonerequest"
                )
                .withRel("tmpphonerequest")
        );

        return model;
    }
}
