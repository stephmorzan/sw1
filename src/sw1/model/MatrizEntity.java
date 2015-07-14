package sw1.model;

import javax.persistence.*;

/**
 * Created by Ricardo on 13/07/2015.
 */
@Entity
@Table(name = "matriz", schema = "", catalog = "bcp")
public class MatrizEntity {
    private int idMatriz;
    private String area;

    @Id
    @Column(name = "idMatriz")
    public int getIdMatriz() {
        return idMatriz;
    }

    public void setIdMatriz(int idMatriz) {
        this.idMatriz = idMatriz;
    }

    @Basic
    @Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatrizEntity that = (MatrizEntity) o;

        if (idMatriz != that.idMatriz) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMatriz;
        result = 31 * result + (area != null ? area.hashCode() : 0);
        return result;
    }
}
