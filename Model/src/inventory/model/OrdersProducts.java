package inventory.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(OrdersProductsPK.class)
public class OrdersProducts {
    private Integer ordersId;
    private Integer productsId;
    private String quantity;
    private Orders ordersByOrdersId;
    private Products productsByProductsId;

    @Id
    @Column(name = "ordersId")
    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    @Id
    @Column(name = "productsId")
    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    @Basic
    @Column(name = "quantity")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersProducts that = (OrdersProducts) o;
        return Objects.equals(ordersId, that.ordersId) &&
                Objects.equals(productsId, that.productsId) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersId, productsId, quantity);
    }

    @ManyToOne
    @JoinColumn(name = "ordersId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Orders getOrdersByOrdersId() {
        return ordersByOrdersId;
    }

    public void setOrdersByOrdersId(Orders ordersByOrdersId) {
        this.ordersByOrdersId = ordersByOrdersId;
    }

    @ManyToOne
    @JoinColumn(name = "productsId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Products getProductsByProductsId() {
        return productsByProductsId;
    }

    public void setProductsByProductsId(Products productsByProductsId) {
        this.productsByProductsId = productsByProductsId;
    }
}
