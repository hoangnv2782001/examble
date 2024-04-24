package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    @Override
    public void createUser(UserDto userDto) {
        User user = User.builder().username(userDto.getUsername()).password(passwordEncoder.encode(userDto.getPassword())).build();


        userRepository.save(user);
    }

    @Override
    public void authenticateUser(UserDto userDto) {

    }
}
