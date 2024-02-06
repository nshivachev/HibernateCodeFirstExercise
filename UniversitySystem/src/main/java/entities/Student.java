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
@Table(name = "students")
public class Student extends Person {
    @Column(name = "average_grade")
    private double averageGrade;

    @Basic
    private int attendance;

    @ManyToMany(targetEntity = Course.class, mappedBy = "students")
    private Set<Course> courses;
}
