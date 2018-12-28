package inventory.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Products {
    private Integer id;
    private String productName;
    private String partNumber;
    private String productLabel;
    private String productPice;
    private String productDescription;
    private String status;
    private Date createdAt;
    private Date updatedAt;
    private Collection<OrdersProducts> ordersProductsById;
    private Collection<ProductsCategories> productsCategoriesById;
    private ProductsDetails productsDetailsById;
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
    @Column(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "partNumber")
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Basic
    @Column(name = "productLabel")
    public String getProductLabel() {
        return productLabel;
    }

    public void setProductLabel(String productLabel) {
        this.productLabel = productLabel;
    }

    @Basic
    @Column(name = "productPice")
    public String getProductPice() {
        return productPice;
    }

    public void setProductPice(String productPice) {
        this.productPice = productPice;
    }

    @Basic
    @Column(name = "productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        Products products = (Products) o;
        return Objects.equals(id, products.id) &&
                Objects.equals(productName, products.productName) &&
                Objects.equals(partNumber, products.partNumber) &&
                Objects.equals(productLabel, products.productLabel) &&
                Objects.equals(productPice, products.productPice) &&
                Objects.equals(productDescription, products.productDescription) &&
                Objects.equals(status, products.status) &&
                Objects.equals(createdAt, products.createdAt) &&
                Objects.equals(updatedAt, products.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, partNumber, productLabel, productPice, productDescription, status, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "productsByProductsId")
    public Collection<OrdersProducts> getOrdersProductsById() {
        return ordersProductsById;
    }

    public void setOrdersProductsById(Collection<OrdersProducts> ordersProductsById) {
        this.ordersProductsById = ordersProductsById;
    }

    @OneToMany(mappedBy = "productsByProductsId")
    public Collection<ProductsCategories> getProductsCategoriesById() {
        return productsCategoriesById;
    }

    public void setProductsCategoriesById(Collection<ProductsCategories> productsCategoriesById) {
        this.productsCategoriesById = productsCategoriesById;
    }

    @OneToOne(mappedBy = "productsByProductsId")
    public ProductsDetails getProductsDetailsById() {
        return productsDetailsById;
    }

    public void setProductsDetailsById(ProductsDetails productsDetailsById) {
        this.productsDetailsById = productsDetailsById;
    }

    @OneToMany(mappedBy = "productsByProductsId")
    public Collection<Purchases> getPurchasesById() {
        return purchasesById;
    }

    public void setPurchasesById(Collection<Purchases> purchasesById) {
        this.purchasesById = purchasesById;
    }
}
