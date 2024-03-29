package com.myblog.myblog.repository;

import com.myblog.myblog.entity.Role;
import com.myblog.myblog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
   Optional<Role> findByName(String name);
}
