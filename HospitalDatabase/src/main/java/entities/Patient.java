package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "patients")
public class Patient extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Basic
    private String address;

    @Basic
    private String email;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Basic
    private String picture;

    @Column(name = "medical_insurance")
    private boolean medicalInsurance;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Visitation> visitations;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Diagnose diagnose;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Medicament> medications;

    public Patient() {
        visitations = new ArrayList<>();
        medications = new ArrayList<>();
    }

    public Patient(Visitation visitation, Diagnose diagnose, Medicament medicament) {
        this();

        this.diagnose = diagnose;
        this.visitations.add(visitation);
        this.medications.add(medicament);
    }
}
