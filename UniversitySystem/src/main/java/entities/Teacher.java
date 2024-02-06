package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "teachers")
public class Teacher extends Person {
    @Basic
    private String email;

    @Column(name = "salary_per_hour")
    private double salaryPerHour;

    @OneToMany(targetEntity = Course.class, mappedBy = "teacher")
    private Set<Course> courses;
}
