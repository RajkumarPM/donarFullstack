package com.assignment.fullstackbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// Annotates this class as a JPA entity, so it's mapped to a database table.
@Entity
public class Login {

    // Specifies the primary key of the entity.
    @Id
    // Configures the way of increment of the specified column(field).
    @GeneratedValue
    private Long id; // Unique identifier for each login entry.

    private String username; // Stores the username for login.
    private Long mobileno; // Stores the mobile number for login (assuming it's used for login).

    // Getters and setters for each field.
    // They allow other classes to access and modify the fields of this Login entity.

    public Long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password; // Stores the password for login.
}
