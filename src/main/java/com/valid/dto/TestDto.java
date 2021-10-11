package com.valid.dto;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * created by Gyunny 2021/10/11
 */
@Getter
public class TestDto {

    @NotNull
    private String name;

    @Email
    private String email;

}
