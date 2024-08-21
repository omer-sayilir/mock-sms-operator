package tr.com.kolaysoft.peyk.mocksmsoperator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.kolaysoft.peyk.mocksmsoperator.entity.SmsRecord;
import java.util.List;
/**
 * @author omersayilir
 */

@Repository
public interface SmsRepository  extends JpaRepository<SmsRecord, Integer> {

    List<SmsRecord> findAllByState(Integer state);

}
