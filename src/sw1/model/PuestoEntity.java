package sw1.model;

import javax.persistence.*;

/**
 * Created by Ricardo on 13/07/2015.
 */
@Entity
@Table(name = "puesto", schema = "bcp", catalog = "bcp")
public class PuestoEntity {
    private int idPuesto;
    private String nombrePuesto;
    private MatrizEntity idMatriz;

    @Id
    @Column(name = "idPuesto")
    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    @Basic
    @Column(name = "nombrePuesto")
    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PuestoEntity that = (PuestoEntity) o;

        if (idPuesto != that.idPuesto) return false;
        if (nombrePuesto != null ? !nombrePuesto.equals(that.nombrePuesto) : that.nombrePuesto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPuesto;
        result = 31 * result + (nombrePuesto != null ? nombrePuesto.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "idMatriz", referencedColumnName = "idMatriz", nullable = false)
    public MatrizEntity getIdMatriz() {
        return idMatriz;
    }

    public void setIdMatriz(MatrizEntity idMatriz) {
        this.idMatriz = idMatriz;
    }
}
