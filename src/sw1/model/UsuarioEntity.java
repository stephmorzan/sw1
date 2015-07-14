package sw1.model;

import javax.persistence.*;

/**
 * Created by Ricardo on 13/07/2015.
 */
@Entity
@Table(name = "usuario", schema = "", catalog = "bcp")
public class UsuarioEntity {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String clave;
    private String email;
    private PuestoEntity idPuesto;
    private UsuarioEntity idJefe;

    @Id
    @Column(name = "id_usuario")
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "clave")
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioEntity that = (UsuarioEntity) o;

        if (idUsuario != that.idUsuario) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (apellido != null ? !apellido.equals(that.apellido) : that.apellido != null) return false;
        if (clave != null ? !clave.equals(that.clave) : that.clave != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "idPuesto", referencedColumnName = "idPuesto")
    public PuestoEntity getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(PuestoEntity idPuesto) {
        this.idPuesto = idPuesto;
    }

    @OneToOne
    @JoinColumn(name = "idJefe", referencedColumnName = "id_usuario")
    public UsuarioEntity getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(UsuarioEntity idJefe) {
        this.idJefe = idJefe;
    }
}
