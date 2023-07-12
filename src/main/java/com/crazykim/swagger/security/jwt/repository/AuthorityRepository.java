package com.crazykim.swagger.security.jwt.repository;

import com.crazykim.swagger.security.jwt.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
