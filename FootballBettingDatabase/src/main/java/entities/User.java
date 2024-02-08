package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Basic
    private String username;

    @Basic
    private String password;

    @Basic
    private String email;

    @Basic
    private String fullName;

    @Basic
    private BigDecimal balance;
}
