package com.API.Mapa_do_Vestibulando.infra.security;

import com.API.Mapa_do_Vestibulando.Repository.UserRepository;
import com.API.Mapa_do_Vestibulando.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;


@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
    User user = this.repository.findByEmail(username).orElseThrow() -> UsernameNotFoundException("User not found");
        }

}
