package com.libware.repository;

import com.libware.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsernameIgnoreCase(String username);

	User findByEmailIgnoreCase(String email);

	User findByUsernameOrEmail(String username, String email);
}
