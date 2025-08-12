package com.example.demo.repository;

import com.example.demo.model.Arch;
import com.example.demo.model.ArchPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchRepository extends JpaRepository<Arch, ArchPk> {
}