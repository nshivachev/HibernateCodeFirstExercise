import entities.Diagnose;
import entities.Medicament;
import entities.Patient;
import entities.Visitation;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    private static final String DB_NAME = "hospital";

    public static void main(String[] args) {
        final EntityManager entityManager = Persistence.createEntityManagerFactory(DB_NAME).createEntityManager();

        entityManager.getTransaction().begin();

        Diagnose diagnose = new Diagnose();
        Medicament medicament = new Medicament();
        Visitation visitation = new Visitation();
        Patient patient = new Patient(visitation, diagnose, medicament);
        medicament.setPatient(patient);
        visitation.setPatient(patient);

        entityManager.persist(patient);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
