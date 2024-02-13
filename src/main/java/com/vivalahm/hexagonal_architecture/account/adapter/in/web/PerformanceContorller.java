package com.vivalahm.hexagonal_architecture.account.adapter.in.web;

import com.vivalahm.hexagonal_architecture.account.application.port.in.GetPerformanceInfoUseCase;
import com.vivalahm.hexagonal_architecture.account.domain.PerformanceInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/performance")
@RequiredArgsConstructor
public class PerformanceContorller {
    private final GetPerformanceInfoUseCase getPerfomanceInfoUseCase;

    @GetMapping
    public List<PerformanceInfo> getAllPerformanceInfo() {
        return getPerfomanceInfoUseCase.getPerformanceInfoAllList();
    }
}
