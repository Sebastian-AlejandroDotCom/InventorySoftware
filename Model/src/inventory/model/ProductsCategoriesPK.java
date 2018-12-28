package inventory.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProductsCategoriesPK implements Serializable {
    private Integer productsId;
    private Integer categoriesId;

    @Column(name = "productsId")
    @Id
    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    @Column(name = "categoriesId")
    @Id
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
        ProductsCategoriesPK that = (ProductsCategoriesPK) o;
        return Objects.equals(productsId, that.productsId) &&
                Objects.equals(categoriesId, that.categoriesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsId, categoriesId);
    }
}
