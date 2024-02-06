import entities.Customer;
import entities.Product;
import entities.Sale;
import entities.StoreLocation;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    private static final String DB_NAME = "sales";

    public static void main(String[] args) {
        final EntityManager entityManager = Persistence.createEntityManagerFactory(DB_NAME).createEntityManager();

        entityManager.getTransaction().begin();

        Product product = new Product();
        Product product2 = new Product();
        Customer customer = new Customer();
        Customer customer2 = new Customer();
        StoreLocation storeLocation = new StoreLocation();
        StoreLocation storeLocation2 = new StoreLocation();
        Sale sale = new Sale(product, customer2, storeLocation);
        Sale sale2 = new Sale(product2, customer, storeLocation2);

        entityManager.persist(product);
        entityManager.persist(product2);
        entityManager.persist(customer);
        entityManager.persist(customer2);
        entityManager.persist(storeLocation);
        entityManager.persist(storeLocation2);
        entityManager.persist(sale);
        entityManager.persist(sale2);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
