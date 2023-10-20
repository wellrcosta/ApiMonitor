package com.monitor.apimonitor.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "TB_USERS")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String password;
    private boolean admin;
    private boolean emailConfirmed;
    private String emailConfirmationToken;
    @CreationTimestamp
    private LocalDateTime createdAt;
}
