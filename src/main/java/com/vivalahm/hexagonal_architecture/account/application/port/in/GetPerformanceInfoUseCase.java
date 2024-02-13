package com.vivalahm.hexagonal_architecture.account.application.port.in;

import com.vivalahm.hexagonal_architecture.account.domain.PerformanceInfo;

import java.util.List;

public interface GetPerformanceInfoUseCase {
    List<PerformanceInfo> getPerformanceInfoAllList();
}
