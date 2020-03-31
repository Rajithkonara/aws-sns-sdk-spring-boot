package com.rkdevblog.sns.controller;

import com.rkdevblog.sns.dto.SmsRequestDto;
import com.rkdevblog.sns.exception.AwsSnsClientException;
import com.rkdevblog.sns.service.AwsSnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sms")
public class SMSController {

    private final AwsSnsService awsSnsService;

    @Autowired
    public SMSController(AwsSnsService awsSnsService) {
        this.awsSnsService = awsSnsService;
    }

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> sendSms(@RequestBody SmsRequestDto smsRequestDto ) {
        try {
            awsSnsService.sendSms(smsRequestDto.getMobileNo(), smsRequestDto.getMessage());
            return ResponseEntity.ok("Successfully Sent SMS");
        } catch (AwsSnsClientException e) {
            return ResponseEntity.status(500).body("Error occurred while sending sms " + e);
        }
    }
}
