package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "bank_account")
public class BankAccount extends BillingDetail {
    private static final String BILLING_DETAIL_TYPE = "BANK_ACCOUNT";

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "swift_code")
    private String swiftCode;

    public BankAccount() {
        super(BILLING_DETAIL_TYPE);
    }
}
