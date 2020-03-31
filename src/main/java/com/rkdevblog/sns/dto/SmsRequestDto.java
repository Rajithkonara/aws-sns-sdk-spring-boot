package com.rkdevblog.sns.dto;

import lombok.Getter;

@Getter
public class SmsRequestDto {
    private String mobileNo;
    private String message;
}

