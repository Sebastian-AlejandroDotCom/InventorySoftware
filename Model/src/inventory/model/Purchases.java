package inventory.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(PurchasesPK.class)
public class Purchases {
    private Integer id;
    private Integer numberReceived;
    private Date purchaseDate;
    private Date createdAt;
    private Date updatedAt;
    private Integer productsId;
    private Integer suppliersId;
    private Products productsByProductsId;
    private Suppliers suppliersBySuppliersId;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "numberReceived")
    public Integer getNumberReceived() {
        return numberReceived;
    }

    public void setNumberReceived(Integer numberReceived) {
        this.numberReceived = numberReceived;
    }

    @Basic
    @Column(name = "purchaseDate")
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
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

    @Id
    @Column(name = "productsId")
    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    @Id
    @Column(name = "suppliersId")
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
        Purchases purchases = (Purchases) o;
        return Objects.equals(id, purchases.id) &&
                Objects.equals(numberReceived, purchases.numberReceived) &&
                Objects.equals(purchaseDate, purchases.purchaseDate) &&
                Objects.equals(createdAt, purchases.createdAt) &&
                Objects.equals(updatedAt, purchases.updatedAt) &&
                Objects.equals(productsId, purchases.productsId) &&
                Objects.equals(suppliersId, purchases.suppliersId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberReceived, purchaseDate, createdAt, updatedAt, productsId, suppliersId);
    }

    @ManyToOne
    @JoinColumn(name = "productsId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Products getProductsByProductsId() {
        return productsByProductsId;
    }

    public void setProductsByProductsId(Products productsByProductsId) {
        this.productsByProductsId = productsByProductsId;
    }

    @ManyToOne
    @JoinColumn(name = "suppliersId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Suppliers getSuppliersBySuppliersId() {
        return suppliersBySuppliersId;
    }

    public void setSuppliersBySuppliersId(Suppliers suppliersBySuppliersId) {
        this.suppliersBySuppliersId = suppliersBySuppliersId;
    }
}
