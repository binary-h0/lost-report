package lostreport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostreport.KtApplication;
import lostreport.domain.CreatedTmpPhone;
import lostreport.domain.DeviceOpened;

@Entity
@Table(name = "CustomerManage_table")
@Data
//<<< DDD / Aggregate Root
public class CustomerManage {

    @Id
    private String imei;

    private String status;

    public static CustomerManageRepository repository() {
        CustomerManageRepository customerManageRepository = KtApplication.applicationContext.getBean(
            CustomerManageRepository.class
        );
        return customerManageRepository;
    }

    //<<< Clean Arch / Port Method
    public static void createTmpPhone(TmpPhoneRequested tmpPhoneRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        CustomerManage customerManage = new CustomerManage();
        repository().save(customerManage);

        CreatedTmpPhone createdTmpPhone = new CreatedTmpPhone(customerManage);
        createdTmpPhone.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(tmpPhoneRequested.get???()).ifPresent(customerManage->{
            
            customerManage // do something
            repository().save(customerManage);

            CreatedTmpPhone createdTmpPhone = new CreatedTmpPhone(customerManage);
            createdTmpPhone.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
