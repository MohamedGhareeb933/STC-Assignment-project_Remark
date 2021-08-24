package management.dao;

import management.entity.Cancelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "cancelation", path = "cancelation")
public interface CancelationRepository extends JpaRepository<Cancelation, Long> {
}
