package com.mkpits.bank.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private Long id;
    private String username;
    private String email;
    private String mobil;

}
