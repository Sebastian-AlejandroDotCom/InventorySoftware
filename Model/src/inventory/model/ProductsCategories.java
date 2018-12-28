package inventory.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(ProductsCategoriesPK.class)
public class ProductsCategories {
    private Integer productsId;
    private Integer categoriesId;
    private Products productsByProductsId;
    private Categories categoriesByCategoriesId;

    @Id
    @Column(name = "productsId")
    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    @Id
    @Column(name = "categoriesId")
    public Integer getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(Integer categoriesId) {
        this.categoriesId = categoriesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsCategories that = (ProductsCategories) o;
        return Objects.equals(productsId, that.productsId) &&
                Objects.equals(categoriesId, that.categoriesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsId, categoriesId);
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
    @JoinColumn(name = "categoriesId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Categories getCategoriesByCategoriesId() {
        return categoriesByCategoriesId;
    }

    public void setCategoriesByCategoriesId(Categories categoriesByCategoriesId) {
        this.categoriesByCategoriesId = categoriesByCategoriesId;
    }
}
