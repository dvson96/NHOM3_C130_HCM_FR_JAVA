package com.team3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team3.app.entities.AdminUsers;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUsers, Integer>{

}
