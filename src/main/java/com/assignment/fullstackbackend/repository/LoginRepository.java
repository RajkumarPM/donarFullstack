package com.assignment.fullstackbackend.repository;
import com.assignment.fullstackbackend.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoginRepository extends JpaRepository<Login, Long>{
    Login findByUsername(String username);
}
