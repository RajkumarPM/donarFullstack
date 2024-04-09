package com.assignment.fullstackbackend.repository;

import com.assignment.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>
{


}
