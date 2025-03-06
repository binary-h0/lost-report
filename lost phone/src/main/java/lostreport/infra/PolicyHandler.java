package lostreport.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import lostreport.config.kafka.KafkaProcessor;
import lostreport.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    RemoteManageRepository remoteManageRepository;

    @Autowired
    PhoneRepository phoneRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FindRequested'"
    )
    public void wheneverFindRequested_CreateRemoteManage(
        @Payload FindRequested findRequested
    ) {
        FindRequested event = findRequested;
        System.out.println(
            "\n\n##### listener CreateRemoteManage : " + findRequested + "\n\n"
        );

        // Sample Logic //
        RemoteManage.createRemoteManage(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FindRequestCanceled'"
    )
    public void wheneverFindRequestCanceled_DeleteRemoteManage(
        @Payload FindRequestCanceled findRequestCanceled
    ) {
        FindRequestCanceled event = findRequestCanceled;
        System.out.println(
            "\n\n##### listener DeleteRemoteManage : " +
            findRequestCanceled +
            "\n\n"
        );

        // Sample Logic //
        RemoteManage.deleteRemoteManage(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FindRequestFinished'"
    )
    public void wheneverFindRequestFinished_DeleteRemoteManage(
        @Payload FindRequestFinished findRequestFinished
    ) {
        FindRequestFinished event = findRequestFinished;
        System.out.println(
            "\n\n##### listener DeleteRemoteManage : " +
            findRequestFinished +
            "\n\n"
        );

        // Sample Logic //
        RemoteManage.deleteRemoteManage(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='GpsRequested'"
    )
    public void wheneverGpsRequested_GetGps(
        @Payload GpsRequested gpsRequested
    ) {
        GpsRequested event = gpsRequested;
        System.out.println(
            "\n\n##### listener GetGps : " + gpsRequested + "\n\n"
        );

        // Sample Logic //
        Phone.getGps(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LockRequested'"
    )
    public void wheneverLockRequested_SetLock(
        @Payload LockRequested lockRequested
    ) {
        LockRequested event = lockRequested;
        System.out.println(
            "\n\n##### listener SetLock : " + lockRequested + "\n\n"
        );

        // Sample Logic //
        Phone.setLock(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AlarmRequested'"
    )
    public void wheneverAlarmRequested_GetAlarm(
        @Payload AlarmRequested alarmRequested
    ) {
        AlarmRequested event = alarmRequested;
        System.out.println(
            "\n\n##### listener GetAlarm : " + alarmRequested + "\n\n"
        );

        // Sample Logic //
        Phone.getAlarm(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='GotGps'"
    )
    public void wheneverGotGps_UpdatePhoneStatus(@Payload GotGps gotGps) {
        GotGps event = gotGps;
        System.out.println(
            "\n\n##### listener UpdatePhoneStatus : " + gotGps + "\n\n"
        );

        // Sample Logic //
        RemoteManage.updatePhoneStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='SetLock'"
    )
    public void wheneverSetLock_UpdatePhoneStatus(@Payload SetLock setLock) {
        SetLock event = setLock;
        System.out.println(
            "\n\n##### listener UpdatePhoneStatus : " + setLock + "\n\n"
        );

        // Sample Logic //
        RemoteManage.updatePhoneStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='GotAlarm'"
    )
    public void wheneverGotAlarm_UpdatePhoneStatus(@Payload GotAlarm gotAlarm) {
        GotAlarm event = gotAlarm;
        System.out.println(
            "\n\n##### listener UpdatePhoneStatus : " + gotAlarm + "\n\n"
        );

        // Sample Logic //
        RemoteManage.updatePhoneStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
