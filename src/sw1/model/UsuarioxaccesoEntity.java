package sw1.model;

import javax.persistence.*;

/**
 * Created by Ricardo on 14/07/2015.
 */
@Entity
@Table(name = "usuarioxacceso", schema = "", catalog = "bcp")
public class UsuarioxaccesoEntity {
    private String autorizador;
    private AccesoEntity idAcceso;
    private UsuarioEntity idUsuario;
    private UsuarioEntity idJefe;

    @Basic
    @Column(name = "autorizador")
    public String getAutorizador() {
        return autorizador;
    }

    public void setAutorizador(String autorizador) {
        this.autorizador = autorizador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioxaccesoEntity that = (UsuarioxaccesoEntity) o;

        if (autorizador != null ? !autorizador.equals(that.autorizador) : that.autorizador != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return autorizador != null ? autorizador.hashCode() : 0;
    }

    @OneToOne
    @JoinColumn(name = "idAcceso", referencedColumnName = "idAcceso", nullable = false)
    public AccesoEntity getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(AccesoEntity idAcceso) {
        this.idAcceso = idAcceso;
    }

    @OneToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "id_usuario", nullable = false)
    public UsuarioEntity getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuarioEntity idUsuario) {
        this.idUsuario = idUsuario;
    }

    @OneToOne
    @JoinColumn(name = "idJefe", referencedColumnName = "id_usuario", nullable = false)
    public UsuarioEntity getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(UsuarioEntity idJefe) {
        this.idJefe = idJefe;
    }
}
