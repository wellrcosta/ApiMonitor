package com.monitor.apimonitor.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name = "TB_USERS")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String name;
    private String email;
    private String password;
    private boolean admin;
    private boolean emailConfirmed;
    private String emailConfirmationToken;

    @OneToMany
    private Set<MonitoredApiModel> monitoredApis;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
