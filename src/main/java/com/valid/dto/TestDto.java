package com.valid.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

/**
 * created by Gyunny 2021/10/11
 */
@Getter
public class TestDto {

    @NotBlank
    private String name;

}
