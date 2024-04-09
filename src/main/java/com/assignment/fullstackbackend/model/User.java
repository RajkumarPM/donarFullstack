package com.assignment.fullstackbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
// Annotates this class as a JPA entity, so it's mapped to a database table.
@Entity
public class User {
    // Fields of the User class are mapped to columns in the database table.
   @Id // Specifies the primary key of the entity.
   @GeneratedValue // Configures the way of increment of the specified column(field).

   private Long id; // Unique identifier for each user.

    private String name; // Stores the user's name.
    private String username; // Stores the user's username.
    private String email; // Stores the user's email address.
    private String type; // Stores the type of the user (could represent roles or categories).
    private Long phone; // Stores the user's phone number.
    private String address; // Stores the user's address.
    private String country; // Stores the user's country.
    private String zipcode; // Stores the user's postal or zip code.
    private String info; // Stores additional information about the user.
    // Getters and setters for each field.
    // They allow other classes to access and modify the fields of this User entity.
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }



    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
