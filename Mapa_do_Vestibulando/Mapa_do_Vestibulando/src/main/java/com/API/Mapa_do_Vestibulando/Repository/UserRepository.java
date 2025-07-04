package com.API.Mapa_do_Vestibulando.Repository;

import com.API.Mapa_do_Vestibulando.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}