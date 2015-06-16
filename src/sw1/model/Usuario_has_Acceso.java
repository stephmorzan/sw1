package sw1.model;

/**
 * Created by Ricardo on 16/06/2015.
 */
public class Usuario_has_Acceso {
    String Usuario_Matricula;
    String Usuario_Jefe;
    int  Usuario_Puesto_idPuesto;
    int Usuario_Puesto_Matriz_idMatriz;
    int Acceso_idAcceso;
    boolean Autorizador;

    public Usuario_has_Acceso() {
    }

    public String getUsuario_Matricula() {
        return Usuario_Matricula;
    }

    public void setUsuario_Matricula(String usuario_Matricula) {
        Usuario_Matricula = usuario_Matricula;
    }

    public String getUsuario_Jefe() {
        return Usuario_Jefe;
    }

    public void setUsuario_Jefe(String usuario_Jefe) {
        Usuario_Jefe = usuario_Jefe;
    }

    public int getUsuario_Puesto_idPuesto() {
        return Usuario_Puesto_idPuesto;
    }

    public void setUsuario_Puesto_idPuesto(int usuario_Puesto_idPuesto) {
        Usuario_Puesto_idPuesto = usuario_Puesto_idPuesto;
    }

    public int getUsuario_Puesto_Matriz_idMatriz() {
        return Usuario_Puesto_Matriz_idMatriz;
    }

    public void setUsuario_Puesto_Matriz_idMatriz(int usuario_Puesto_Matriz_idMatriz) {
        Usuario_Puesto_Matriz_idMatriz = usuario_Puesto_Matriz_idMatriz;
    }

    public int getAcceso_idAcceso() {
        return Acceso_idAcceso;
    }

    public void setAcceso_idAcceso(int acceso_idAcceso) {
        Acceso_idAcceso = acceso_idAcceso;
    }

    public boolean isAutorizador() {
        return Autorizador;
    }

    public void setAutorizador(boolean autorizador) {
        Autorizador = autorizador;
    }
}
