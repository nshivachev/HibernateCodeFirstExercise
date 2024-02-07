package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Basic
    private String email;

    @Basic
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BillingDetail> billingDetails;

    public User() {
        billingDetails = new ArrayList<>();
    }

    public void addBillingDetail(BillingDetail billingDetail) {
        billingDetails.add(billingDetail);
    }
}
