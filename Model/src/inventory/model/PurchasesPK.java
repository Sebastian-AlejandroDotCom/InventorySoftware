package inventory.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PurchasesPK implements Serializable {
    private Integer id;
    private Integer productsId;
    private Integer suppliersId;

    @Column(name = "id")
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "productsId")
    @Id
    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    @Column(name = "suppliersId")
    @Id
    public Integer getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Integer suppliersId) {
        this.suppliersId = suppliersId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchasesPK that = (PurchasesPK) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(productsId, that.productsId) &&
                Objects.equals(suppliersId, that.suppliersId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productsId, suppliersId);
    }
}
