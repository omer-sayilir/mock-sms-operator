package tr.com.kolaysoft.peyk.mocksmsoperator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.kolaysoft.peyk.mocksmsoperator.entity.SmsRecord;
import tr.com.kolaysoft.peyk.mocksmsoperator.model.*;
import tr.com.kolaysoft.peyk.mocksmsoperator.service.SmsRecordService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author omersayilir
 */
@RestController
@RequestMapping("/sms")
public class SmsController {
    private final AtomicLong counter = new AtomicLong(361124870);
    private SmsRecordService smsRecordService;
    public SmsController(SmsRecordService smsRecordService) {
        this.smsRecordService = smsRecordService;
    }

    @RequestMapping(value = "/create")
    public ResponseEntity<?> sendSms(@RequestBody SmsRequest request) {
        System.out.println(request);
        SmsRecord smsRecord = new SmsRecord();
        smsRecord.setReceiver(request.getNumber().get(0));
        smsRecord.setCredit(2);
        smsRecord.setReceivedDate(LocalDateTime.now());
        smsRecord.setSendingDate(LocalDateTime.now());
        smsRecord.setDeliveryDate(LocalDateTime.now().plusMinutes(2));
        smsRecord.setState(SmsPkgState.SENDING.getValue());
        SmsRecord savedSmsRecord = smsRecordService.save(smsRecord);
        SmsResponse response = new SmsResponse();
        SmsResponse.Data data = new SmsResponse.Data();
        data.setPkgID(savedSmsRecord.getId().intValue());
        response.setData(data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping("/list-item")
    public ResponseEntity<?> getReport(@RequestBody SmsReportRequest request) {
        SmsRecord record= smsRecordService.findById(Integer.valueOf(request.getPkgID()));
        SmsResponse response= prepareResponse(record);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private SmsResponse prepareResponse(SmsRecord record) {
        SmsResponse response = new SmsResponse();
        SmsResponse.Data data = new SmsResponse.Data();
        SmsResult smsResult= new SmsResult();
        ArrayList<SmsResult> list = new ArrayList<>();
        if(record!=null) {
            smsResult.setCredit(record.getCredit());
            smsResult.setState(SmsState.DELIVERED.getValue());
            smsResult.setSender("KOLAYSOFT");
            smsResult.setSetState(record.getState());
            smsResult.setTarget(record.getReceiver());
            smsResult.setId(record.getId().toString());
            smsResult.setDeliveryDate(record.getDeliveryDate());
            smsResult.setSendingDate(record.getSendingDate());
            smsResult.setProcessingDate(record.getSendingDate());
            list.add(smsResult);
        }
        data.setList(list);
        response.setData(data);
        return response;
    }

}
