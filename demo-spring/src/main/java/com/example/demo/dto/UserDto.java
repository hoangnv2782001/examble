package com.example.demo.dto;


import com.example.demo.model.Role;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * validation các trường dto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @Size(min = 4,max = 10,message = "username không hợp lệ")
    private String username;


    private String password;

    @NotNull(message = "role không được null")
    private Role role;

    @Email(message = "email không hợp lệ")
    @NotBlank(message = "email không được trống")
    private String email;

    @Min(value = 18,message = "Age không được nhỏ hơn 18")
    private int age;
}
