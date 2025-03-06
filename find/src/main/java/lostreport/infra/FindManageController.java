package lostreport.infra;
import lostreport.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/findManages")
@Transactional
public class FindManageController {
    @Autowired
    FindManageRepository findManageRepository;

    @RequestMapping(value = "/findManages/findrequest",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public FindManage findRequest(HttpServletRequest request, HttpServletResponse response, 
        ) throws Exception {
            System.out.println("##### /findManage/findRequest  called #####");
            FindManage findManage = new FindManage();
            findManage.findRequest();
            findManageRepository.save(findManage);
            return findManage;
    }
}
//>>> Clean Arch / Inbound Adaptor
