package improvment.repositories;

import improvment.entities.cargos.CBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CBORepository extends JpaRepository<CBO, Long> {
}
