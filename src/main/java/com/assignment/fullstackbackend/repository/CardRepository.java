package com.assignment.fullstackbackend.repository;

import com.assignment.fullstackbackend.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {

}