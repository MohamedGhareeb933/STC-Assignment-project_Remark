package management.dao;

import management.entity.Appointment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "appointment", path = "appointment")
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    // find appointment by patient id
    Page<Appointment> findByPatientId(@RequestParam("id") long id, Pageable pageable);

    // find appointment by patient first name
    Page<Appointment> findByPatientFirstName(@RequestParam("name") String name, Pageable pageable);

    // find appointment by patient last name
    Page<Appointment> findByPatientLastName(@RequestParam("name") String name, Pageable pageable);

    // find by date for example Appointment date was 20/8/2021 ENDPOINT : findAllWithDateBefore?before=1/9/2021
    @Query("select a from Appointment a where a.date <= :before")
    Page<Appointment> findAllWithDateBefore(@DateTimeFormat(pattern = "dd/MM/yyyy") @Param("before")  Date before, Pageable pageable);

    // find by date - for example Appointment date was 20/8/2021 ENDPOINT : findAllWithDateBefore?after=1/8/2020
    @Query("select a from Appointment a where a.date >= :after")
    Page<Appointment> findAllWithDateAfter(@DateTimeFormat(pattern = "dd/MM/yyyy") @Param("after")  Date after, Pageable pageable);

    // find by date in between for example Appointment date was 20/8/2021 ENDPOINT : findAllWithDateBetween?from=1/1/2020&to=1/1/2022
    @Query("select a from Appointment a where a.date >= :from AND a.date <= :to")
    Page<Appointment> findAllWithDateBetween(@DateTimeFormat(pattern = "dd/MM/yyyy") @Param("from")  Date from,
                                             @DateTimeFormat(pattern = "dd/MM/yyyy") @Param("to")  Date to,
                                             Pageable pageable);
}
