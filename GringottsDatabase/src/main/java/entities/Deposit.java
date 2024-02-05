package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "deposits")
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "deposit_group", length = 20)
    private String depositGroup;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Basic
    private Double amount;

    @Basic
    private Double interest;

    @Basic
    private Double charge;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "is_expired")
    private boolean isExpired;

    @ManyToOne
    @JoinColumn(name = "wizard_id", referencedColumnName = "id", nullable = false)
    private Wizard wizard;
}
