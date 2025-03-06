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
    CustomerManageRepository customerManageRepository;

    @Autowired
    DeviceManageRepository deviceManageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TmpPhoneRequested'"
    )
    public void wheneverTmpPhoneRequested_CreateTmpPhone(
        @Payload TmpPhoneRequested tmpPhoneRequested
    ) {
        TmpPhoneRequested event = tmpPhoneRequested;
        System.out.println(
            "\n\n##### listener CreateTmpPhone : " + tmpPhoneRequested + "\n\n"
        );

        // Sample Logic //
        CustomerManage.createTmpPhone(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CreatedTmpPhone'"
    )
    public void wheneverCreatedTmpPhone_RegisterDevice(
        @Payload CreatedTmpPhone createdTmpPhone
    ) {
        CreatedTmpPhone event = createdTmpPhone;
        System.out.println(
            "\n\n##### listener RegisterDevice : " + createdTmpPhone + "\n\n"
        );

        // Sample Logic //
        DeviceManage.registerDevice(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CreatedRemoteManage'"
    )
    public void wheneverCreatedRemoteManage_ChangeLostDeviceStatus(
        @Payload CreatedRemoteManage createdRemoteManage
    ) {
        CreatedRemoteManage event = createdRemoteManage;
        System.out.println(
            "\n\n##### listener ChangeLostDeviceStatus : " +
            createdRemoteManage +
            "\n\n"
        );

        // Sample Logic //
        DeviceManage.changeLostDeviceStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeletedRemoteManage'"
    )
    public void wheneverDeletedRemoteManage_ChangeLostDeviceStatus(
        @Payload DeletedRemoteManage deletedRemoteManage
    ) {
        DeletedRemoteManage event = deletedRemoteManage;
        System.out.println(
            "\n\n##### listener ChangeLostDeviceStatus : " +
            deletedRemoteManage +
            "\n\n"
        );

        // Sample Logic //
        DeviceManage.changeLostDeviceStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
