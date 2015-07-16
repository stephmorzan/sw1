package sw1.model;

import javax.persistence.*;

/**
 * Created by Ricardo on 14/07/2015.
 */
@Entity
@Table(name = "acceso", schema = "bcp", catalog = "bcp")
public class AccesoEntity {
    private int idAcceso;
    private BuzonEntity idBuzon;
    private CarpetacompartidaEntity idCarpetaComp;
    private PerfilInternetEntity idPerfilInternet;



    @Id
    @Column(name = "idAcceso")
    public int getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(int idAcceso) {
        this.idAcceso = idAcceso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccesoEntity that = (AccesoEntity) o;

        return idAcceso == that.idAcceso;

    }

    @Override
    public int hashCode() {
        return idAcceso;
    }

    @OneToOne
    @JoinColumn(name = "idBuzon", referencedColumnName = "idBuzon", nullable = false)
    public BuzonEntity getIdBuzon() {
        return idBuzon;
    }

    public void setIdBuzon(BuzonEntity idBuzon) {
        this.idBuzon = idBuzon;
    }

    @OneToOne
    @JoinColumn(name = "idCarpetaComp", referencedColumnName = "idCarpetaComp", nullable = false)
    public CarpetacompartidaEntity getIdCarpetaComp() {
        return idCarpetaComp;
    }

    public void setIdCarpetaComp(CarpetacompartidaEntity idCarpetaComp) {
        this.idCarpetaComp = idCarpetaComp;
    }

    @OneToOne
    @JoinColumn(name = "idPerfil_Internet", referencedColumnName = "idperfil_Internet", nullable = false)
    public PerfilInternetEntity getIdPerfilInternet() {
        return idPerfilInternet;
    }

    public void setIdPerfilInternet(PerfilInternetEntity idPerfilInternet) {
        this.idPerfilInternet = idPerfilInternet;
    }

    @Override
    public String toString() {
        return "AccesoEntity{" +
                "idAcceso=" + idAcceso +
                ", idBuzon=" + idBuzon +
                ", idCarpetaComp=" + idCarpetaComp +
                ", idPerfilInternet=" + idPerfilInternet +
                '}';
    }



    public String gettearNombreAcceso(){
        if (idBuzon != null){
            return idBuzon.getNombreBuzon();
        }else if(idCarpetaComp != null){
            return idCarpetaComp.getNombreCarpComp();
        }else if(idPerfilInternet !=null){
            return idPerfilInternet.getNombrePerfil();
        }else{
            return ":(";
        }
    }

}
