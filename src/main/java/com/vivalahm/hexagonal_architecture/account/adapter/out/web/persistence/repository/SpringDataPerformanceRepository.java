package com.vivalahm.hexagonal_architecture.account.adapter.out.web.persistence.repository;

import com.vivalahm.hexagonal_architecture.account.adapter.out.web.persistence.entity.PerformanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SpringDataPerformanceRepository extends JpaRepository<PerformanceEntity, UUID>{
    List<PerformanceEntity> findByIsReserve(String isReserve);

    PerformanceEntity findByName(String name);
}
