package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "visitations")
public class Visitation extends BaseEntity {
    @Basic
    private Date date;

    @Basic
    private String comment;

    @ManyToOne
    @JoinColumn
    private Patient patient;
}
