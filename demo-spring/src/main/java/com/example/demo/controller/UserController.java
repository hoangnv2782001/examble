package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * restful api : dùng để giao tiếp giữa client và server
 */
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {


    /**
     * userrepo sẽ được tự động khởi tạo và inject thông qua contructor
     */
    private final UserRepository userRepository;

    /**
     *
     * @return danh sách user
     */
    @GetMapping
    public ResponseEntity<?> getUser(){

        return ResponseEntity.ok(userRepository.findAll());
    }


    /**
     *
     * @param userDto thông tin user mới
     * @return
     */
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto){

        return ResponseEntity.ok(userRepository.save(User.builder().name(userDto.getName()).age(userDto.getAge()).build()));
    }


    /**
     * update thông tin một user theo id
     * @param id: của user update
     * @param userDto : thông tin update của user
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") int id,@RequestBody UserDto userDto){

        User user = userRepository.findById(id).orElse(new User());
        return ResponseEntity.ok(userRepository.save(User.builder().name(userDto.getName()).age(userDto.getAge()).build()));
    }

    /**
     * delete user 
     * @param id của user delete
     * @return
     */

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id){

        userRepository.delete(User.builder().id(id).build());
        return ResponseEntity.ok().build();
    }

}
