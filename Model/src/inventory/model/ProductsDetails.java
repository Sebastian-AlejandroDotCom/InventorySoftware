package inventory.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class ProductsDetails {
    private Integer id;
    private Integer startingInventory;
    private Integer inventoryReceived;
    private Integer inventoryShipped;
    private Integer inventoryOnHand;
    private Integer minimumRequired;
    private Date createdAt;
    private Date updatedAt;
    private Integer productsId;
    private Products productsByProductsId;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "startingInventory")
    public Integer getStartingInventory() {
        return startingInventory;
    }

    public void setStartingInventory(Integer startingInventory) {
        this.startingInventory = startingInventory;
    }

    @Basic
    @Column(name = "inventoryReceived")
    public Integer getInventoryReceived() {
        return inventoryReceived;
    }

    public void setInventoryReceived(Integer inventoryReceived) {
        this.inventoryReceived = inventoryReceived;
    }

    @Basic
    @Column(name = "inventoryShipped")
    public Integer getInventoryShipped() {
        return inventoryShipped;
    }

    public void setInventoryShipped(Integer inventoryShipped) {
        this.inventoryShipped = inventoryShipped;
    }

    @Basic
    @Column(name = "inventoryOnHand")
    public Integer getInventoryOnHand() {
        return inventoryOnHand;
    }

    public void setInventoryOnHand(Integer inventoryOnHand) {
        this.inventoryOnHand = inventoryOnHand;
    }

    @Basic
    @Column(name = "minimumRequired")
    public Integer getMinimumRequired() {
        return minimumRequired;
    }

    public void setMinimumRequired(Integer minimumRequired) {
        this.minimumRequired = minimumRequired;
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

    @Basic
    @Column(name = "productsId")
    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsDetails that = (ProductsDetails) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(startingInventory, that.startingInventory) &&
                Objects.equals(inventoryReceived, that.inventoryReceived) &&
                Objects.equals(inventoryShipped, that.inventoryShipped) &&
                Objects.equals(inventoryOnHand, that.inventoryOnHand) &&
                Objects.equals(minimumRequired, that.minimumRequired) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(productsId, that.productsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startingInventory, inventoryReceived, inventoryShipped, inventoryOnHand, minimumRequired, createdAt, updatedAt, productsId);
    }

    @OneToOne
    @JoinColumn(name = "productsId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Products getProductsByProductsId() {
        return productsByProductsId;
    }

    public void setProductsByProductsId(Products productsByProductsId) {
        this.productsByProductsId = productsByProductsId;
    }
}
