package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "players")
public class Player extends BaseEntity {
    @Basic
    private String name;

    @Column(name = "squad_number")
    private Short squadNumber;

    @ManyToOne
    @JoinColumn
    private Team team;

    @ManyToOne
    @JoinColumn
    private Position Position;

    @Column(name = "is_injured")
    private Boolean isInjured;
}
