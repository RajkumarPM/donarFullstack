package com.assignment.fullstackbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// Annotates this class as a JPA entity, so it's mapped to a database table.
@Entity
public class Card {

    // Specifies the primary key of the entity.
    @Id
    // Configures the way of increment of the specified column(field).
    @GeneratedValue
    private Long id; // Unique identifier for each card.

    private String donor; // Stores the donor's information.
    private String organ; // Stores the type of organ being donated.

    private String contact; // Stores the contact information.
    private String username; // Stores the username.
    private String password; // Stores the password.

    // Getters and setters for each field.
    // They allow other classes to access and modify the fields of this Card entity.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
