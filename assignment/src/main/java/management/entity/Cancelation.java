package management.entity;

import javax.persistence.*;

@Entity
@Table(name = "cancelation")
public class Cancelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "patient_request")
    private String patientRequest;

    @Column(name = "physician_apology")
    private String physicianApology;

    @OneToOne(mappedBy = "cancelation")
    private Appointment appointment;


    public Cancelation() {
    }

    public Cancelation(String patientRequest, String physicianApology, Appointment appointmentID) {
        this.patientRequest = patientRequest;
        this.physicianApology = physicianApology;
        this.appointment = appointmentID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPatientRequest() {
        return patientRequest;
    }

    public void setPatientRequest(String patientRequest) {
        this.patientRequest = patientRequest;
    }

    public String getPhysicianApology() {
        return physicianApology;
    }

    public void setPhysicianApology(String physicianApology) {
        this.physicianApology = physicianApology;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
