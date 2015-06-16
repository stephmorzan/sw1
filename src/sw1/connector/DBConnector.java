package sw1.connector;

import sw1.model.Acceso;
import sw1.model.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ricardo on 16/06/2015.
 */
public class DBConnector {
    public List<Usuario> getUsuariosForAcceso(Acceso acceso) {
        List<Usuario> respuesta = new ArrayList<>();
        Usuario a = new Usuario();
        a.setNombre("Jorge");
        a.setApellido("Irey");
        a.setClave(123456);
        a.setJefe("Checa");
        a.setPuesto_idPuesto(1);
        a.setPuesto_Matriz_idMatriz(1);
        respuesta.add(a);

        Usuario b = new Usuario();
        b.setNombre("Jaime");
        b.setApellido("Pirca");
        b.setClave(123456);
        b.setJefe("Iret");
        b.setPuesto_idPuesto(2);
        b.setPuesto_Matriz_idMatriz(2);
        respuesta.add(b);

        return respuesta;
    }
}
