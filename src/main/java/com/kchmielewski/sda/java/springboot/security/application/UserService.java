package com.kchmielewski.sda.java.springboot.security.application;

import com.kchmielewski.sda.java.springboot.security.application.entity.UserEntity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserService implements UserDetailsService {
    private final UserRepository repository;
    private final PasswordEncoder encoder;

    public UserService(UserRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
        createSampleUser();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return toUser(repository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username)));
    }

    private void createSampleUser() {
        if (!repository.findByUsername("user").isPresent()) {
            UserEntity entity = new UserEntity("user", encoder.encode("password"), "ROLE_USER");
            repository.save(entity);
        }
    }

    private User toUser(UserEntity entity) {
        return new User(entity.getUsername(), entity.getPassword(), Collections.singletonList(new SimpleGrantedAuthority(entity.getRole())));
    }
}
