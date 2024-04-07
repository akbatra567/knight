package com.mykraftyskills.knight.repository;

import com.mykraftyskills.knight.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
