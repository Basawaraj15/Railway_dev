package com.example.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String imageName;

    private Boolean isActive;

    // Lombok will handle the constructors, getters, setters, and toString method

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + ", imageName=" + imageName + ", isActive=" + isActive + "]";
    }
}

