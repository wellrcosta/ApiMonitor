package com.monitor.apimonitor.models;

import com.monitor.apimonitor.enums.StatusApi;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "TB_MONITORED_APIS")
public class MonitoredApiModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long apiId;
    private String name;
    private String apiUrl;
    private StatusApi status;

    @ManyToOne
    private UserModel user;

    @OneToMany
    private Set<ApiLogModel> logs;
}
