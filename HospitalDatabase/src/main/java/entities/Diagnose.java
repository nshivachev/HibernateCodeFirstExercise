package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "diagnoses")
public class Diagnose extends BaseEntity {
    @Basic
    private String name;

    @Basic
    private String comment;
}
