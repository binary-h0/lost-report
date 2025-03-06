package lostreport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostreport.FindApplication;
import lostreport.domain.FindRequestCanceled;
import lostreport.domain.FindRequested;

@Entity
@Table(name = "FindManage_table")
@Data
//<<< DDD / Aggregate Root
public class FindManage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String imei;

    private String gps;

    private String lockState;

    private String status;

    private Date lostAt;

    private String tmpPhoneImei;

    private String tmpPhoneStatus;

    @PrePersist
    public void onPrePersist() {
        FindRequested findRequested = new FindRequested(this);
        findRequested.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        FindRequestCanceled findRequestCanceled = new FindRequestCanceled(this);
        findRequestCanceled.publishAfterCommit();
    }

    public static FindManageRepository repository() {
        FindManageRepository findManageRepository = FindApplication.applicationContext.getBean(
            FindManageRepository.class
        );
        return findManageRepository;
    }

    public void findRequestCancel() {
        //
    }

    //<<< Clean Arch / Port Method
    public void findRequestFinish() {
        //implement business logic here:

        FindRequestFinished findRequestFinished = new FindRequestFinished(this);
        findRequestFinished.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void gpsRequest() {
        //implement business logic here:

        GpsRequested gpsRequested = new GpsRequested(this);
        gpsRequested.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void lockRequest() {
        //implement business logic here:

        LockRequested lockRequested = new LockRequested(this);
        lockRequested.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void alarmRequest() {
        //implement business logic here:

        AlarmRequested alarmRequested = new AlarmRequested(this);
        alarmRequested.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void tmpPhoneRequest() {
        //implement business logic here:

        TmpPhoneRequested tmpPhoneRequested = new TmpPhoneRequested(this);
        tmpPhoneRequested.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void findManageStatusUpdate(
        ChangedLostDeviceStatus changedLostDeviceStatus
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        FindManage findManage = new FindManage();
        repository().save(findManage);

        */

        /** Example 2:  finding and process
        

        repository().findById(changedLostDeviceStatus.get???()).ifPresent(findManage->{
            
            findManage // do something
            repository().save(findManage);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void findManageStatusUpdate(
        UpdatedPhoneStatus updatedPhoneStatus
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        FindManage findManage = new FindManage();
        repository().save(findManage);

        */

        /** Example 2:  finding and process
        

        repository().findById(updatedPhoneStatus.get???()).ifPresent(findManage->{
            
            findManage // do something
            repository().save(findManage);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void phoneOpeningStatusUpdate(
        RegisteredDevice registeredDevice
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        FindManage findManage = new FindManage();
        repository().save(findManage);

        */

        /** Example 2:  finding and process
        

        repository().findById(registeredDevice.get???()).ifPresent(findManage->{
            
            findManage // do something
            repository().save(findManage);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
