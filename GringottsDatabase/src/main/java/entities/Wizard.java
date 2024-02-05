package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "wizards")
public class Wizard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String firstName;

    @Column(length = 60, nullable = false)
    private String lastName;

    @Column(length = 1000)
    private String notes;

    @Column(nullable = false)
    private Integer age;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "magic_wand_id", referencedColumnName = "id", nullable = false)
    private MagicWand magicWand;

    @OneToMany(targetEntity = Deposit.class, mappedBy = "wizard",
            fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Deposit> deposits;

    public Wizard() {
        deposits = new ArrayList<>();
    }

    public Wizard(String lastName, int age, MagicWand magicWand) {
        this();

        this.lastName = lastName;
        this.age = age;
        this.magicWand = magicWand;
    }

    public void addDeposit(Deposit deposit) {
        deposits.add(deposit);
    }
}
