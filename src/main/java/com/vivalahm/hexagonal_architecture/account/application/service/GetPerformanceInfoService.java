package com.vivalahm.hexagonal_architecture.account.application.service;

import com.vivalahm.hexagonal_architecture.account.application.port.in.GetPerformanceInfoUseCase;
import com.vivalahm.hexagonal_architecture.account.application.port.out.LoadPerformancePort;
import com.vivalahm.hexagonal_architecture.account.domain.PerformanceInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetPerformanceInfoService implements GetPerformanceInfoUseCase {
    private final LoadPerformancePort loadPerformancePort;

    @Override
    public List<PerformanceInfo> getPerformanceInfoAllList() {
        return loadPerformancePort.getAllPerformanceInfo();
    }
}
