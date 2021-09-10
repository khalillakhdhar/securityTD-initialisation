package com.orsys.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orsys.security.entities.AppRole;

public interface RoleRepository extends JpaRepository<AppRole, String> {
public AppRole findByRoleName(String roleName);
}