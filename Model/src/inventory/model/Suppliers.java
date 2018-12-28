package inventory.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Suppliers {
    private Integer id;
    private String supplierName;
    private Date createdAt;
    private Date updatedAt;
    private Collection<Purchases> purchasesById;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "supplierName")
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Basic
    @Column(name = "createdAt")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updatedAt")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suppliers suppliers = (Suppliers) o;
        return Objects.equals(id, suppliers.id) &&
                Objects.equals(supplierName, suppliers.supplierName) &&
                Objects.equals(createdAt, suppliers.createdAt) &&
                Objects.equals(updatedAt, suppliers.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, supplierName, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "suppliersBySuppliersId")
    public Collection<Purchases> getPurchasesById() {
        return purchasesById;
    }

    public void setPurchasesById(Collection<Purchases> purchasesById) {
        this.purchasesById = purchasesById;
    }
}
