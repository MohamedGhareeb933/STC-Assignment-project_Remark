package management.entity;

import org.dom4j.rule.Pattern;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "review")
    private String review;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cancelation_id")
    private Cancelation cancelation;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public Appointment() {
    }

    public Appointment(String review, Date date, Cancelation cancelation, Patient patient) {
        this.review = review;
        this.date = date;
        this.cancelation = cancelation;
        this.patient = patient;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Cancelation getCancelation() {
        return cancelation;
    }

    public void setCancelation(Cancelation cancelation) {
        this.cancelation = cancelation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
