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
    FindManageRepository findManageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ChangedLostDeviceStatus'"
    )
    public void wheneverChangedLostDeviceStatus_FindManageStatusUpdate(
        @Payload ChangedLostDeviceStatus changedLostDeviceStatus
    ) {
        ChangedLostDeviceStatus event = changedLostDeviceStatus;
        System.out.println(
            "\n\n##### listener FindManageStatusUpdate : " +
            changedLostDeviceStatus +
            "\n\n"
        );

        // Sample Logic //
        FindManage.findManageStatusUpdate(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='UpdatedPhoneStatus'"
    )
    public void wheneverUpdatedPhoneStatus_FindManageStatusUpdate(
        @Payload UpdatedPhoneStatus updatedPhoneStatus
    ) {
        UpdatedPhoneStatus event = updatedPhoneStatus;
        System.out.println(
            "\n\n##### listener FindManageStatusUpdate : " +
            updatedPhoneStatus +
            "\n\n"
        );

        // Sample Logic //
        FindManage.findManageStatusUpdate(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RegisteredDevice'"
    )
    public void wheneverRegisteredDevice_PhoneOpeningStatusUpdate(
        @Payload RegisteredDevice registeredDevice
    ) {
        RegisteredDevice event = registeredDevice;
        System.out.println(
            "\n\n##### listener PhoneOpeningStatusUpdate : " +
            registeredDevice +
            "\n\n"
        );

        // Sample Logic //
        FindManage.phoneOpeningStatusUpdate(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
