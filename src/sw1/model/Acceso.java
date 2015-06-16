package sw1.model;

/**
 * Created by Ricardo on 16/06/2015.
 */
public class Acceso {
    int idAcceso;
    int idPerfilInternet;
    int idCarpetaComp;
    int idBuzon;
    int Buzon_idButton;
    int CarpetaComp_id_CarpetaComp;
    int PerfilInternet_idPerfilInternet;

    public Acceso() {
    }

    public int getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(int idAcceso) {
        this.idAcceso = idAcceso;
    }

    public int getIdPerfilInternet() {
        return idPerfilInternet;
    }

    public void setIdPerfilInternet(int idPerfilInternet) {
        this.idPerfilInternet = idPerfilInternet;
    }

    public int getIdCarpetaComp() {
        return idCarpetaComp;
    }

    public void setIdCarpetaComp(int idCarpetaComp) {
        this.idCarpetaComp = idCarpetaComp;
    }

    public int getIdBuzon() {
        return idBuzon;
    }

    public void setIdBuzon(int idBuzon) {
        this.idBuzon = idBuzon;
    }

    public int getBuzon_idButton() {
        return Buzon_idButton;
    }

    public void setBuzon_idButton(int buzon_idButton) {
        Buzon_idButton = buzon_idButton;
    }

    public int getCarpetaComp_id_CarpetaComp() {
        return CarpetaComp_id_CarpetaComp;
    }

    public void setCarpetaComp_id_CarpetaComp(int carpetaComp_id_CarpetaComp) {
        CarpetaComp_id_CarpetaComp = carpetaComp_id_CarpetaComp;
    }

    public int getPerfilInternet_idPerfilInternet() {
        return PerfilInternet_idPerfilInternet;
    }

    public void setPerfilInternet_idPerfilInternet(int perfilInternet_idPerfilInternet) {
        PerfilInternet_idPerfilInternet = perfilInternet_idPerfilInternet;
    }
}
