package spring.gym.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring.gym.dto.LoginRequestDto;
import spring.gym.dto.RegisterRequestDto;
import spring.gym.dto.TokenResponseDTO;
import spring.gym.service.AuthService;

@RestController
@RequestMapping("/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody @Valid RegisterRequestDto registerRequestDto) throws Exception{
        authService.register(registerRequestDto);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public TokenResponseDTO login(@RequestBody @Valid LoginRequestDto loginRequestDto) throws Exception{
        return authService.login(loginRequestDto);
    }
}
