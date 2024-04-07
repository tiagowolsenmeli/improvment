package improvment.repositories;

import improvment.entities.cargos.CBO;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CBORepository extends JpaRepository<CBO, Long> {

//  @Query(value = "delete from CBO c where c.data_criacao <= :dateCreated", nativeQuery = true)
  @Transactional
  @Modifying
  List<CBO> deleteByDataCriacaoLessThan(LocalDateTime dateCreated, Pageable pageable);
}
