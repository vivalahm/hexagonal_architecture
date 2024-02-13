package com.vivalahm.hexagonal_architecture.account.application.port.out;

import com.vivalahm.hexagonal_architecture.account.domain.PerformanceInfo;

import java.util.List;

public interface LoadPerformancePort {
    List<PerformanceInfo> getAllPerformanceInfo();
}
