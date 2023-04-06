package com.ia2r.eshop.ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Product name is required.")
    @Basic(optional = false)
    private String name;

    @NotNull(message = "Product imgsrc is required.")
    @Basic(optional = false)
    private String imageSrc;

    private String imageAlt;

    private Double price;

    private String Grade;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public void setImageAlt(String imageAlt) {
        this.imageAlt = imageAlt;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public Product(Long id, @NotNull(message = "Product name is required.") String name, @NotNull(message = "Product name is required.") String imgSrc, String imgAlt, Double price, int quantity, String gundam_class) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageSrc = imgSrc;
        this.imageAlt = imgAlt;
        this.Grade = gundam_class;
        this.quantity = quantity;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public String getImageAlt() {
        return imageAlt;
    }

    public void setImageSrc(String url) {
        this.imageSrc = url;
    }


}
