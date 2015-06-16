package sw1.model;

/**
 * Created by Ricardo on 16/06/2015.
 */
public class Usuario {
    String Matricula;
    int Clave;
    String Nombre;
    String Apellido;
    String Jefe;
    int Puesto_idPuesto;
    int Puesto_Matriz_idMatriz;

    public Usuario() {
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int clave) {
        Clave = clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getJefe() {
        return Jefe;
    }

    public void setJefe(String jefe) {
        Jefe = jefe;
    }

    public int getPuesto_idPuesto() {
        return Puesto_idPuesto;
    }

    public void setPuesto_idPuesto(int puesto_idPuesto) {
        Puesto_idPuesto = puesto_idPuesto;
    }

    public int getPuesto_Matriz_idMatriz() {
        return Puesto_Matriz_idMatriz;
    }

    public void setPuesto_Matriz_idMatriz(int puesto_Matriz_idMatriz) {
        Puesto_Matriz_idMatriz = puesto_Matriz_idMatriz;
    }
}
