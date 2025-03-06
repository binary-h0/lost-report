package lostreport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostreport.LostPhoneApplication;
import lostreport.domain.CreatedRemoteManage;
import lostreport.domain.DeletedRemoteManage;
import lostreport.domain.UpdatedPhoneStatus;

@Entity
@Table(name = "RemoteManage_table")
@Data
//<<< DDD / Aggregate Root
public class RemoteManage {

    @Id
    private String imei;

    private String userName;

    private String status;

    private String gps;

    private Boolean lock;

    private Boolean alarm;

    public static RemoteManageRepository repository() {
        RemoteManageRepository remoteManageRepository = LostPhoneApplication.applicationContext.getBean(
            RemoteManageRepository.class
        );
        return remoteManageRepository;
    }

    //<<< Clean Arch / Port Method
    public static void createRemoteManage(FindRequested findRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        RemoteManage remoteManage = new RemoteManage();
        repository().save(remoteManage);

        CreatedRemoteManage createdRemoteManage = new CreatedRemoteManage(remoteManage);
        createdRemoteManage.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(findRequested.get???()).ifPresent(remoteManage->{
            
            remoteManage // do something
            repository().save(remoteManage);

            CreatedRemoteManage createdRemoteManage = new CreatedRemoteManage(remoteManage);
            createdRemoteManage.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void deleteRemoteManage(
        FindRequestCanceled findRequestCanceled
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        RemoteManage remoteManage = new RemoteManage();
        repository().save(remoteManage);

        DeletedRemoteManage deletedRemoteManage = new DeletedRemoteManage(remoteManage);
        deletedRemoteManage.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(findRequestCanceled.get???()).ifPresent(remoteManage->{
            
            remoteManage // do something
            repository().save(remoteManage);

            DeletedRemoteManage deletedRemoteManage = new DeletedRemoteManage(remoteManage);
            deletedRemoteManage.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void deleteRemoteManage(
        FindRequestFinished findRequestFinished
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        RemoteManage remoteManage = new RemoteManage();
        repository().save(remoteManage);

        DeletedRemoteManage deletedRemoteManage = new DeletedRemoteManage(remoteManage);
        deletedRemoteManage.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(findRequestFinished.get???()).ifPresent(remoteManage->{
            
            remoteManage // do something
            repository().save(remoteManage);

            DeletedRemoteManage deletedRemoteManage = new DeletedRemoteManage(remoteManage);
            deletedRemoteManage.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updatePhoneStatus(GotGps gotGps) {
        //implement business logic here:

        /** Example 1:  new item 
        RemoteManage remoteManage = new RemoteManage();
        repository().save(remoteManage);

        UpdatedPhoneStatus updatedPhoneStatus = new UpdatedPhoneStatus(remoteManage);
        updatedPhoneStatus.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(gotGps.get???()).ifPresent(remoteManage->{
            
            remoteManage // do something
            repository().save(remoteManage);

            UpdatedPhoneStatus updatedPhoneStatus = new UpdatedPhoneStatus(remoteManage);
            updatedPhoneStatus.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updatePhoneStatus(SetLock setLock) {
        //implement business logic here:

        /** Example 1:  new item 
        RemoteManage remoteManage = new RemoteManage();
        repository().save(remoteManage);

        UpdatedPhoneStatus updatedPhoneStatus = new UpdatedPhoneStatus(remoteManage);
        updatedPhoneStatus.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(setLock.get???()).ifPresent(remoteManage->{
            
            remoteManage // do something
            repository().save(remoteManage);

            UpdatedPhoneStatus updatedPhoneStatus = new UpdatedPhoneStatus(remoteManage);
            updatedPhoneStatus.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updatePhoneStatus(GotAlarm gotAlarm) {
        //implement business logic here:

        /** Example 1:  new item 
        RemoteManage remoteManage = new RemoteManage();
        repository().save(remoteManage);

        UpdatedPhoneStatus updatedPhoneStatus = new UpdatedPhoneStatus(remoteManage);
        updatedPhoneStatus.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(gotAlarm.get???()).ifPresent(remoteManage->{
            
            remoteManage // do something
            repository().save(remoteManage);

            UpdatedPhoneStatus updatedPhoneStatus = new UpdatedPhoneStatus(remoteManage);
            updatedPhoneStatus.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
