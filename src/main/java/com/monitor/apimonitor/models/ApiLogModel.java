package com.monitor.apimonitor.models;

import com.monitor.apimonitor.enums.StatusApi;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "TB_API_LOGS")
public class ApiLogModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;
    private LocalDateTime timestamp;
    private StatusApi status;
    private String responseTime;
    private String responseCode;
    private String responseBody;
    private String responseHeaders;
    private String requestMethod;
}
