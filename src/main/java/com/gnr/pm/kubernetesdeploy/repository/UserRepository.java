package com.gnr.pm.kubernetesdeploy.repository;

import com.gnr.pm.kubernetesdeploy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
