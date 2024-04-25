package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * restful api : dùng để giao tiếp giữa client và server
 */
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;
    /**
     * userrepo sẽ được tự động khởi tạo và inject thông qua contructor
     */
    private final UserRepository userRepository;

    /**
     *
     * @return danh sách user
     */
    @GetMapping
    public ResponseEntity<?> getUsers(){

        return ResponseEntity.ok(userRepository.findAll());
    }





    /**
     * update thông tin một user theo id
     * @param id: của user update
     * @param userDto : thông tin update của user
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") int id,@RequestBody @Valid UserDto userDto){

        User user = userRepository.findById(id).orElse(new User());
        return ResponseEntity.ok(userRepository.save(User.builder().username(userDto.getUsername()).build()));
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
