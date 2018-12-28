package inventory.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Orders {
    private Integer id;
    private String title;
    private String firstName;
    private String lastName;
    private Integer numberShipped;
    private Date orderDate;
    private String status;
    private Date createdAt;
    private Date updatedAt;
    private Collection<OrdersProducts> ordersProductsById;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "numberShipped")
    public Integer getNumberShipped() {
        return numberShipped;
    }

    public void setNumberShipped(Integer numberShipped) {
        this.numberShipped = numberShipped;
    }

    @Basic
    @Column(name = "orderDate")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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
        Orders orders = (Orders) o;
        return Objects.equals(id, orders.id) &&
                Objects.equals(title, orders.title) &&
                Objects.equals(firstName, orders.firstName) &&
                Objects.equals(lastName, orders.lastName) &&
                Objects.equals(numberShipped, orders.numberShipped) &&
                Objects.equals(orderDate, orders.orderDate) &&
                Objects.equals(status, orders.status) &&
                Objects.equals(createdAt, orders.createdAt) &&
                Objects.equals(updatedAt, orders.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, firstName, lastName, numberShipped, orderDate, status, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "ordersByOrdersId")
    public Collection<OrdersProducts> getOrdersProductsById() {
        return ordersProductsById;
    }

    public void setOrdersProductsById(Collection<OrdersProducts> ordersProductsById) {
        this.ordersProductsById = ordersProductsById;
    }
}
