package tr.com.kolaysoft.peyk.mocksmsoperator.service;

import org.springframework.stereotype.Service;
import tr.com.kolaysoft.peyk.mocksmsoperator.entity.SmsRecord;
import tr.com.kolaysoft.peyk.mocksmsoperator.repository.SmsRepository;
import java.util.List;

/**
 * @author omersayilir
 */
@Service
public class SmsRecordService {
    private final SmsRepository smsRepository;

    public SmsRecordService(SmsRepository smsRepository) {
        this.smsRepository = smsRepository;
    }

    public List<SmsRecord> findAllByState(Integer state) {
        return smsRepository.findAllByState(state);
    }

    public SmsRecord save(SmsRecord smsRecord) {
        return smsRepository.save(smsRecord);
    }
    public SmsRecord findById(Integer id) {
        return smsRepository.findById(id).orElse(null);
    }
}
