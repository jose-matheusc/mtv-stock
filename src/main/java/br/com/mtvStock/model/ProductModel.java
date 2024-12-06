package br.com.mtvStock.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "product")
@Getter
@Setter
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;


    /**
     * Column code product
     */
    @Column(name = "sku", unique = true, nullable = false)
    private String sku;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductModel model = (ProductModel) o;
        return Double.compare(price, model.price) == 0 && quantity == model.quantity && Objects.equals(id, model.id) && Objects.equals(name, model.name) && Objects.equals(sku, model.sku) && Objects.equals(description, model.description) && Objects.equals(category, model.category) && Objects.equals(createdAt, model.createdAt) && Objects.equals(updatedAt, model.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sku, description, price, quantity, category, createdAt, updatedAt);
    }
}
