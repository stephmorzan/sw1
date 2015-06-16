package sw1.model;

/**
 * Created by Ricardo on 16/06/2015.
 */
public class Puesto {
    int idPuesto;
    String NombrePuesto;
    int Matriz_idMatriz;

    public Puesto() {
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNombrePuesto() {
        return NombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        NombrePuesto = nombrePuesto;
    }

    public int getMatriz_idMatriz() {
        return Matriz_idMatriz;
    }

    public void setMatriz_idMatriz(int matriz_idMatriz) {
        Matriz_idMatriz = matriz_idMatriz;
    }
}
