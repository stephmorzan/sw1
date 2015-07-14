package sw1.connector;


import sw1.model.MatrizEntity;
import sw1.model.PuestoEntity;
import sw1.model.UsuarioEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Ricardo on 12/07/2015.
 */
public class DataBaseController {
    private static DataBaseController ourInstance = new DataBaseController();

    final EntityManagerFactory factory;


    public static DataBaseController getInstance() {
        return ourInstance;
    }

    private DataBaseController() {
        factory = Persistence.createEntityManagerFactory("BCP");

    }

    public boolean createTestUser() {
        EntityManager manager;
        try {
            manager = factory.createEntityManager();
            UsuarioEntity testUser = new UsuarioEntity();
            testUser.setIdUsuario(1);
            testUser.setNombre("Steph");
            testUser.setApellido("Morzan");
            testUser.setEmail("20120871@aloe.ulima.edu.pe");
            testUser.setClave("chocolate");

            MatrizEntity matriz = new MatrizEntity();
            matriz.setIdMatriz(1);
            matriz.setArea("Area 1");
            PuestoEntity puesto = new PuestoEntity();
            puesto.setIdPuesto(1);
            puesto.setIdMatriz(matriz);
            puesto.setNombrePuesto("Tester Oficial");

            testUser.setIdPuesto(puesto);

            manager.getTransaction().begin();
            manager.persist(matriz);
            manager.persist(puesto);
            manager.persist(testUser);
            manager.getTransaction().commit();
            manager.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public UsuarioEntity doLogin(String email, String clave) {

        return null;
    }

    @Override
    protected void finalize() throws Throwable {
        factory.close();
        super.finalize();
    }
}
