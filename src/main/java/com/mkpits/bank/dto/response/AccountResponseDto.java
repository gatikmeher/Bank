package com.mkpits.bank.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountResponseDto {


    private Long id;
    private String accountNumber;
    private String accountType;
    private Double balance;
    private Long userId;
}
