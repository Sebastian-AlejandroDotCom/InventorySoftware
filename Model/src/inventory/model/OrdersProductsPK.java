package inventory.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class OrdersProductsPK implements Serializable {
    private Integer ordersId;
    private Integer productsId;

    @Column(name = "ordersId")
    @Id
    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    @Column(name = "productsId")
    @Id
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
        OrdersProductsPK that = (OrdersProductsPK) o;
        return Objects.equals(ordersId, that.ordersId) &&
                Objects.equals(productsId, that.productsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersId, productsId);
    }
}
