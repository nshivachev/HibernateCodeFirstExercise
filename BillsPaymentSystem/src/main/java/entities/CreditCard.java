package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "credit_card")
public class CreditCard extends BillingDetail {
    private static final String BILLING_DETAIL_TYPE = "CREDIT_CARD";

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "expiration_month")
    private String expiration_month;

    @Column(name = "expiration_year")
    private String expirationYear;

    public CreditCard() {
        super(BILLING_DETAIL_TYPE);
    }
}
