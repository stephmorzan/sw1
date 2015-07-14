package sw1.model;

import javax.persistence.*;

/**
 * Created by Ricardo on 14/07/2015.
 */
@Entity
@Table(name = "carpetacompartida", schema = "bcp", catalog = "bcp")
public class CarpetacompartidaEntity {
    private int idCarpetaComp;
    private String nombreCarpComp;

    @Id
    @Column(name = "idCarpetaComp")
    public int getIdCarpetaComp() {
        return idCarpetaComp;
    }

    public void setIdCarpetaComp(int idCarpetaComp) {
        this.idCarpetaComp = idCarpetaComp;
    }

    @Basic
    @Column(name = "nombreCarpComp")
    public String getNombreCarpComp() {
        return nombreCarpComp;
    }

    public void setNombreCarpComp(String nombreCarpComp) {
        this.nombreCarpComp = nombreCarpComp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarpetacompartidaEntity that = (CarpetacompartidaEntity) o;

        if (idCarpetaComp != that.idCarpetaComp) return false;
        if (nombreCarpComp != null ? !nombreCarpComp.equals(that.nombreCarpComp) : that.nombreCarpComp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCarpetaComp;
        result = 31 * result + (nombreCarpComp != null ? nombreCarpComp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CarpetacompartidaEntity{" +
                "idCarpetaComp=" + idCarpetaComp +
                ", nombreCarpComp='" + nombreCarpComp + '\'' +
                '}';
    }
}
