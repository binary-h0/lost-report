package lostreport.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import lostreport.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/findManages")
@Transactional
public class FindManageController {

    @Autowired
    FindManageRepository findManageRepository;

    @RequestMapping(
        value = "/findManages/{id}/findrequestfinish",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public FindManage findRequestFinish(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /findManage/findRequestFinish  called #####");
        Optional<FindManage> optionalFindManage = findManageRepository.findById(
            id
        );

        optionalFindManage.orElseThrow(() -> new Exception("No Entity Found"));
        FindManage findManage = optionalFindManage.get();
        findManage.findRequestFinish();

        findManageRepository.save(findManage);
        return findManage;
    }

    @RequestMapping(
        value = "/findManages/{id}/gpsrequest",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public FindManage gpsRequest(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /findManage/gpsRequest  called #####");
        Optional<FindManage> optionalFindManage = findManageRepository.findById(
            id
        );

        optionalFindManage.orElseThrow(() -> new Exception("No Entity Found"));
        FindManage findManage = optionalFindManage.get();
        findManage.gpsRequest();

        findManageRepository.save(findManage);
        return findManage;
    }

    @RequestMapping(
        value = "/findManages/{id}/lockrequest",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public FindManage lockRequest(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /findManage/lockRequest  called #####");
        Optional<FindManage> optionalFindManage = findManageRepository.findById(
            id
        );

        optionalFindManage.orElseThrow(() -> new Exception("No Entity Found"));
        FindManage findManage = optionalFindManage.get();
        findManage.lockRequest();

        findManageRepository.save(findManage);
        return findManage;
    }

    @RequestMapping(
        value = "/findManages/{id}/alarmrequest",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public FindManage alarmRequest(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /findManage/alarmRequest  called #####");
        Optional<FindManage> optionalFindManage = findManageRepository.findById(
            id
        );

        optionalFindManage.orElseThrow(() -> new Exception("No Entity Found"));
        FindManage findManage = optionalFindManage.get();
        findManage.alarmRequest();

        findManageRepository.save(findManage);
        return findManage;
    }

    @RequestMapping(
        value = "/findManages/{id}/tmpphonerequest",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public FindManage tmpPhoneRequest(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /findManage/tmpPhoneRequest  called #####");
        Optional<FindManage> optionalFindManage = findManageRepository.findById(
            id
        );

        optionalFindManage.orElseThrow(() -> new Exception("No Entity Found"));
        FindManage findManage = optionalFindManage.get();
        findManage.tmpPhoneRequest();

        findManageRepository.save(findManage);
        return findManage;
    }
}
//>>> Clean Arch / Inbound Adaptor
