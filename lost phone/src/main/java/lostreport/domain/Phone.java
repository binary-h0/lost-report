package lostreport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostreport.LostPhoneApplication;
import lostreport.domain.GotAlarm;
import lostreport.domain.GotGps;
import lostreport.domain.SetLock;

@Entity
@Table(name = "Phone_table")
@Data
//<<< DDD / Aggregate Root
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static PhoneRepository repository() {
        PhoneRepository phoneRepository = LostPhoneApplication.applicationContext.getBean(
            PhoneRepository.class
        );
        return phoneRepository;
    }

    //<<< Clean Arch / Port Method
    public static void getGps(GpsRequested gpsRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Phone phone = new Phone();
        repository().save(phone);

        GotGps gotGps = new GotGps(phone);
        gotGps.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(gpsRequested.get???()).ifPresent(phone->{
            
            phone // do something
            repository().save(phone);

            GotGps gotGps = new GotGps(phone);
            gotGps.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void setLock(LockRequested lockRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Phone phone = new Phone();
        repository().save(phone);

        SetLock setLock = new SetLock(phone);
        setLock.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lockRequested.get???()).ifPresent(phone->{
            
            phone // do something
            repository().save(phone);

            SetLock setLock = new SetLock(phone);
            setLock.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void getAlarm(AlarmRequested alarmRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Phone phone = new Phone();
        repository().save(phone);

        GotAlarm gotAlarm = new GotAlarm(phone);
        gotAlarm.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(alarmRequested.get???()).ifPresent(phone->{
            
            phone // do something
            repository().save(phone);

            GotAlarm gotAlarm = new GotAlarm(phone);
            gotAlarm.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
