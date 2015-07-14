package sw1.model;

import javax.persistence.*;

/**
 * Created by Ricardo on 14/07/2015.
 */
@Entity
@Table(name = "buzon", schema = "bcp", catalog = "bcp")
public class BuzonEntity {
    private int idBuzon;
    private String nombreBuzon;

    @Id
    @Column(name = "idBuzon")
    public int getIdBuzon() {
        return idBuzon;
    }

    public void setIdBuzon(int idBuzon) {
        this.idBuzon = idBuzon;
    }

    @Basic
    @Column(name = "nombreBuzon")
    public String getNombreBuzon() {
        return nombreBuzon;
    }

    public void setNombreBuzon(String nombreBuzon) {
        this.nombreBuzon = nombreBuzon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuzonEntity that = (BuzonEntity) o;

        if (idBuzon != that.idBuzon) return false;
        if (nombreBuzon != null ? !nombreBuzon.equals(that.nombreBuzon) : that.nombreBuzon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBuzon;
        result = 31 * result + (nombreBuzon != null ? nombreBuzon.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BuzonEntity{" +
                "idBuzon=" + idBuzon +
                ", nombreBuzon='" + nombreBuzon + '\'' +
                '}';
    }
}
