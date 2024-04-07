package improvment.usecase;


import improvment.repositories.CBORepository;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteCBOUsecase {
  private final CBORepository cboRepository;
public int execute(LocalDateTime endDateLocalDateTime, int limit) {
  Pageable pageable = Pageable.ofSize(10);
      return cboRepository.deleteByDataCriacaoLessThan(endDateLocalDateTime, pageable).size();
  }
}
