package com.tarpha.demo.repository;

import java.util.List;

import com.tarpha.demo.domain.Demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Long> {

    public List<Demo> findByKeyText(String keyText);
    
}
