import entities.BankAccount;
import entities.CreditCard;
import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    private static final String DB_NAME = "bill_payments";

    public static void main(String[] args) {
        final EntityManager entityManager = Persistence.createEntityManagerFactory(DB_NAME).createEntityManager();

        entityManager.getTransaction().begin();

        BankAccount bankAccount = new BankAccount();
        CreditCard creditCard = new CreditCard();

        User user = new User();
        user.addBillingDetail(bankAccount);
        user.addBillingDetail(creditCard);
        bankAccount.setUser(user);
        creditCard.setUser(user);

        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
