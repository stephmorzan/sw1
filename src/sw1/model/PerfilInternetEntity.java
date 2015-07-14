package sw1.model;

import javax.persistence.*;

/**
 * Created by Ricardo on 14/07/2015.
 */
@Entity
@Table(name = "perfil_internet", schema = "bcp", catalog = "bcp")
public class PerfilInternetEntity {
    private int idperfilInternet;
    private String nombrePerfil;

    @Id
    @Column(name = "idperfil_Internet")
    public int getIdperfilInternet() {
        return idperfilInternet;
    }

    public void setIdperfilInternet(int idperfilInternet) {
        this.idperfilInternet = idperfilInternet;
    }

    @Basic
    @Column(name = "nombrePerfil")
    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PerfilInternetEntity that = (PerfilInternetEntity) o;

        if (idperfilInternet != that.idperfilInternet) return false;
        if (nombrePerfil != null ? !nombrePerfil.equals(that.nombrePerfil) : that.nombrePerfil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idperfilInternet;
        result = 31 * result + (nombrePerfil != null ? nombrePerfil.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PerfilInternetEntity{" +
                "idperfilInternet=" + idperfilInternet +
                ", nombrePerfil='" + nombrePerfil + '\'' +
                '}';
    }
}
