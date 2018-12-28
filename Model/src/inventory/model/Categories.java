package inventory.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Categories {
    private Integer id;
    private String categoryName;
    private Integer categoriesId;
    private Categories categoriesByCategoriesId;
    private Collection<Categories> categoriesById;
    private Collection<ProductsCategories> productsCategoriesById;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "categoryName")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
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
        Categories that = (Categories) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(categoryName, that.categoryName) &&
                Objects.equals(categoriesId, that.categoriesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryName, categoriesId);
    }

    @ManyToOne
    @JoinColumn(name = "categoriesId", referencedColumnName = "id", insertable = false, updatable = false)
    public Categories getCategoriesByCategoriesId() {
        return categoriesByCategoriesId;
    }

    public void setCategoriesByCategoriesId(Categories categoriesByCategoriesId) {
        this.categoriesByCategoriesId = categoriesByCategoriesId;
    }

    @OneToMany(mappedBy = "categoriesByCategoriesId")
    public Collection<Categories> getCategoriesById() {
        return categoriesById;
    }

    public void setCategoriesById(Collection<Categories> categoriesById) {
        this.categoriesById = categoriesById;
    }

    @OneToMany(mappedBy = "categoriesByCategoriesId")
    public Collection<ProductsCategories> getProductsCategoriesById() {
        return productsCategoriesById;
    }

    public void setProductsCategoriesById(Collection<ProductsCategories> productsCategoriesById) {
        this.productsCategoriesById = productsCategoriesById;
    }
}
