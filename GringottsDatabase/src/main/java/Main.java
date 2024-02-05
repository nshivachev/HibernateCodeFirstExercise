import entities.Deposit;
import entities.MagicWand;
import entities.Wizard;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    private static final String DB_NAME = "gringotts";

    public static void main(String[] args) {

        final EntityManager entityManager = Persistence.createEntityManagerFactory(DB_NAME).createEntityManager();

        entityManager.getTransaction().begin();

        final Deposit deposit = new Deposit();
        final MagicWand magicWand = new MagicWand();
        final Wizard wizard = new Wizard("Shivachev", 33, magicWand);

        deposit.setWizard(wizard);
        wizard.addDeposit(deposit);
        magicWand.setWizard(wizard);

        entityManager.persist(wizard);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
