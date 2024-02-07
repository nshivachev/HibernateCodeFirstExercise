package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "medications")
public class Medicament extends BaseEntity{
    @Basic
    private String name;

    @ManyToOne
    @JoinColumn
    private Patient patient;
}