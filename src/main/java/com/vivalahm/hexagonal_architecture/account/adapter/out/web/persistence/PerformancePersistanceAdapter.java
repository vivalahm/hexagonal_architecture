package com.vivalahm.hexagonal_architecture.account.adapter.out.web.persistence;

import com.vivalahm.hexagonal_architecture.account.adapter.out.web.persistence.repository.SpringDataPerformanceRepository;
import com.vivalahm.hexagonal_architecture.account.application.port.out.LoadPerformancePort;
import com.vivalahm.hexagonal_architecture.account.domain.PerformanceInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PerformancePersistanceAdapter implements LoadPerformancePort {
    private final SpringDataPerformanceRepository springDataPerformanceRepository;

    @Override
    public List<PerformanceInfo> getAllPerformanceInfo() {
        return springDataPerformanceRepository.findByIsReserve("enable").stream().map(PerformanceInfo::of).toList();
    }

}
