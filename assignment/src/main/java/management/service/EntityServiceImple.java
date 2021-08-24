package management.service;

import management.dao.PatientRepository;
import management.dto.JBody;
import management.entity.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityServiceImple implements EntityService{

    private PatientRepository patientRepository;

    @Autowired
    public EntityServiceImple(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public String addAppointment(JBody body) {

        // get patient from JSON.
        Patient patient = body.getPatient();

        // set Patient Appointment
        body.getAppointment().forEach(
                appointment -> {
                    patient.add(appointment);
               }
       );

        // Save the Patient
       patientRepository.save(patient);

        return "saved";
    }
}
