package management.dto;

import management.entity.Appointment;
import management.entity.Cancelation;
import management.entity.Patient;

import java.util.HashSet;
import java.util.Set;

public class JBody {

    private Patient patient;
    private Set<Appointment> appointment = new HashSet<>();
    private Cancelation cancelation;

    public JBody() {
    }

    public JBody(Patient patient, Set<Appointment> appointment, Cancelation cancelation) {
        this.patient = patient;
        this.appointment = appointment;
        this.cancelation = cancelation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Set<Appointment> getAppointment() {
        return appointment;
    }

    public void setAppointment(Set<Appointment> appointment) {
        this.appointment = appointment;
    }

    public Cancelation getCancelation() {
        return cancelation;
    }

    public void setCancelation(Cancelation cancelation) {
        this.cancelation = cancelation;
    }
}
