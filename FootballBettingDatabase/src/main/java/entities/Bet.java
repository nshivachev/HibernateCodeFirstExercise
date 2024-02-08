package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "bets")
public class Bet extends BaseEntity {
    @Column(name = "bet_money")
    private BigDecimal betMoney;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @ManyToOne
    private User user;
}
