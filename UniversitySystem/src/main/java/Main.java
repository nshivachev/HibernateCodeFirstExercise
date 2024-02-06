import entities.Course;
import entities.Student;
import entities.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    private static final String DB_NAME = "university_system";

    public static void main(String[] args) {
        final EntityManager entityManager = Persistence.createEntityManagerFactory(DB_NAME).createEntityManager();

        entityManager.getTransaction().begin();

        final Teacher teacher = new Teacher();
        final Student student = new Student();
        final Course course = new Course(teacher, student);

        entityManager.persist(teacher);
        entityManager.persist(student);
        entityManager.persist(course);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
