package sw1.connector;


import sw1.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Ricardo on 12/07/2015.
 */
public class DataBaseController {
    private static DataBaseController ourInstance = new DataBaseController();

    final EntityManagerFactory factory;
    EntityManager manager;

    public static DataBaseController getInstance() {
        return ourInstance;
    }

    private DataBaseController() {
        factory = Persistence.createEntityManagerFactory("BCP");

    }

    public boolean createTestUser() {

        try {
            manager = factory.createEntityManager();

            UsuarioEntity testUser = new UsuarioEntity();
            testUser.setIdUsuario(1);
            testUser.setNombre("Steph");
            testUser.setApellido("Morzan");
            testUser.setEmail("20120871@aloe.ulima.edu.pe");
            testUser.setClave("chocolate");
            testUser.setMatricula("S11894");

            MatrizEntity matriz = new MatrizEntity();
            matriz.setIdMatriz(1);
            matriz.setArea("Area 1");

            PuestoEntity puesto = new PuestoEntity();
            puesto.setIdPuesto(1);
            puesto.setNombrePuesto("Tester Oficial");

            puesto.setIdMatriz(matriz);

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

    public List<AccesoEntity> getAllAccesos() {
        List<AccesoEntity> accesos;
        manager = factory.createEntityManager();
        manager.getTransaction().begin();

        TypedQuery<AccesoEntity> query =
                manager.createQuery("SELECT c FROM AccesoEntity c", AccesoEntity.class);
        accesos = query.getResultList();

        return accesos;
    }

    public boolean guardarSolicitud(int accesoEntity) {
        manager = factory.createEntityManager();
        manager.getTransaction().begin();
        UsuarioxaccesoEntity entity = new UsuarioxaccesoEntity();
        entity.setIdUsuario(manager.find(UsuarioEntity.class, 2));
        entity.setIdJefe(manager.find(UsuarioEntity.class, 3));
        entity.setAutorizador("Alex Vidal");
        entity.setIdAcceso(manager.find(AccesoEntity.class, accesoEntity));
        manager.persist(entity);
        manager.getTransaction().commit();
        return false;
    }

    @Override
    protected void finalize() throws Throwable {
        factory.close();
        super.finalize();
    }
}
