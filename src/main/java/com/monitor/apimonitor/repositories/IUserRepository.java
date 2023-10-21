package com.monitor.apimonitor.repositories;

import com.monitor.apimonitor.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, Long> {
}
