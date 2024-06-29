package com.fuswap.repositories;

import com.fuswap.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, String> {
    Manager findByMUserName(String mUserName);
}
