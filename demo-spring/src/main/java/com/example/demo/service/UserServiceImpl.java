package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    @Override
    public void createUser(UserDto userDto) {


        Set<Role> roleSet = new HashSet<>();

        roleSet.add(userDto.getRole());
        User user = User.builder().username(userDto.getUsername()).password(passwordEncoder.encode(userDto.getPassword())).roles(roleSet).build();
        userRepository.save(user);
    }

    @Override
    public void authenticateUser(UserDto userDto) {

    }
}
