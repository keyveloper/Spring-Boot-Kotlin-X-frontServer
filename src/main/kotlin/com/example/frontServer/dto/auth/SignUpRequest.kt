package com.example.frontServer.dto.auth

import com.example.frontServer.annotaion.ValidBirthday
import com.example.frontServer.annotaion.ValidPassword
import com.example.frontServer.enum.RoleNumber
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Pattern
import java.time.LocalDate

data class SignUpRequest (
    @field:NotEmpty(message = "id is required")
    @field:NotBlank(message = "id can't contain blank")
    @field:Pattern(
        regexp = "^[a-zA-Z0-9]+$",  // alphabet & number only !!
        message = "Username must not contain spaces or special characters"
    )
    val username: String,

    @field:ValidPassword(message = "password must have Character, number and special Char at least one")
    @field:NotEmpty
    val password: String,

    @field:Email(message = "Email format is invalid")
    @field:NotEmpty(message = "email is required")
    val email: String,

    val introduction: String?,

    val birthday: LocalDate?,

    val country: String?,

    var role: RoleNumber = RoleNumber.NORMAL
    )//