package com.example.manufacture;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manufacture.entity.Component;

public interface ComponentRepository extends JpaRepository<Component, Integer> {

}
