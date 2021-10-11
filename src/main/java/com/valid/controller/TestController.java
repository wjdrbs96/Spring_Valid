package com.valid.controller;

import com.valid.dto.TestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * created by Gyunny 2021/10/11
 */
@RequestMapping("/api/v1/test")
@RestController
public class TestController {

    @PostMapping
    public String validTest(@RequestBody @Valid TestDto testDto) {
        return "test";
    }

}
