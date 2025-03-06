package lostreport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostreport.KtApplication;
import lostreport.domain.ChangedLostDeviceStatus;
import lostreport.domain.RegisteredDevice;

@Entity
@Table(name = "DeviceManage_table")
@Data
//<<< DDD / Aggregate Root
public class DeviceManage {

    @Id
    private String imei;

    private String status;

    private String lostAt;

    public static DeviceManageRepository repository() {
        DeviceManageRepository deviceManageRepository = KtApplication.applicationContext.getBean(
            DeviceManageRepository.class
        );
        return deviceManageRepository;
    }

    //<<< Clean Arch / Port Method
    public static void registerDevice(CreatedTmpPhone createdTmpPhone) {
        //implement business logic here:

        /** Example 1:  new item 
        DeviceManage deviceManage = new DeviceManage();
        repository().save(deviceManage);

        RegisteredDevice registeredDevice = new RegisteredDevice(deviceManage);
        registeredDevice.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(createdTmpPhone.get???()).ifPresent(deviceManage->{
            
            deviceManage // do something
            repository().save(deviceManage);

            RegisteredDevice registeredDevice = new RegisteredDevice(deviceManage);
            registeredDevice.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeLostDeviceStatus(
        CreatedRemoteManage createdRemoteManage
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        DeviceManage deviceManage = new DeviceManage();
        repository().save(deviceManage);

        ChangedLostDeviceStatus changedLostDeviceStatus = new ChangedLostDeviceStatus(deviceManage);
        changedLostDeviceStatus.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(createdRemoteManage.get???()).ifPresent(deviceManage->{
            
            deviceManage // do something
            repository().save(deviceManage);

            ChangedLostDeviceStatus changedLostDeviceStatus = new ChangedLostDeviceStatus(deviceManage);
            changedLostDeviceStatus.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeLostDeviceStatus(
        DeletedRemoteManage deletedRemoteManage
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        DeviceManage deviceManage = new DeviceManage();
        repository().save(deviceManage);

        ChangedLostDeviceStatus changedLostDeviceStatus = new ChangedLostDeviceStatus(deviceManage);
        changedLostDeviceStatus.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(deletedRemoteManage.get???()).ifPresent(deviceManage->{
            
            deviceManage // do something
            repository().save(deviceManage);

            ChangedLostDeviceStatus changedLostDeviceStatus = new ChangedLostDeviceStatus(deviceManage);
            changedLostDeviceStatus.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
