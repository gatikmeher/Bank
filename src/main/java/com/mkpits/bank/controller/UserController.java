package com.mkpits.bank.controller;

import com.mkpits.bank.dto.response.AccountResponseDto;
import com.mkpits.bank.dto.response.UserResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<UserResponseDto> userResponseDtoList = new ArrayList<>();

        UserResponseDto userResponseDto1 = UserResponseDto.builder()
                .id(1L)
                .username("user1")
                .email("abc@gmail.com")
                .mobil("1234567890").build();

        UserResponseDto userResponseDto2 = UserResponseDto.builder()
                .id(2L)
                .username("user2")
                .email("abc1@gmail.com")
                .mobil("876123433").build();

        userResponseDtoList.add(userResponseDto1);
        userResponseDtoList.add(userResponseDto2);

        AccountResponseDto accountResponseDto1 = AccountResponseDto.builder()
                .id(1L)
                .accountNumber("123456")
                .accountType("saving")
                .balance(1000.0)
                .userId(1L).build();

        model.addAttribute("users", userResponseDtoList);
        model.addAttribute("account", accountResponseDto1);

        return "users";
    }
}
