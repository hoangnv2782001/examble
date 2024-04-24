package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    /**
     *
     * @param userDto thông tin user mới
     * @return
     */
    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto){

        userService.createUser(userDto);
        return ResponseEntity.ok().build();
    }

    /**
     * authenticate user
     * @param userDto
     * @return
     */
    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@RequestBody UserDto userDto){

        userService.authenticateUser(userDto);
        return ResponseEntity.ok().build();
    }
}
