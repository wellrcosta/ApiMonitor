package com.monitor.apimonitor.repositories;

import com.monitor.apimonitor.models.ApiLogModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IApiLogRepository extends JpaRepository<ApiLogModel, Long> {
}
