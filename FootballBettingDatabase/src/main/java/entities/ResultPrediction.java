package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "result_prediction")
public class ResultPrediction extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private ResultPredictionValues prediction;
}
