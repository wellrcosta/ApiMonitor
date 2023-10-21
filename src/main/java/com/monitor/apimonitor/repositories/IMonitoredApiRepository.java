package com.monitor.apimonitor.repositories;

import com.monitor.apimonitor.models.MonitoredApiModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMonitoredApiRepository extends JpaRepository<MonitoredApiModel, Long> {
}
