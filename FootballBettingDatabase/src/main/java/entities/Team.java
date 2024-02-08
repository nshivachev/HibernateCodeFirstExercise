package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "teams")
public class Team extends BaseEntity {
    @Basic
    private String name;

    @Basic
    private String logo;

    @Column(length = 3)
    private String initials;

    @ManyToOne
    @JoinColumn
    private Color primaryKitColor;

    @ManyToOne
    @JoinColumn
    private Color secondaryKitColor;

    @ManyToOne
    private Town town;

    @Basic
    private BigDecimal budget;
}
