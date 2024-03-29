package com.example.corespringsecurity.user;

import com.example.corespringsecurity.domain.Account;
import com.example.corespringsecurity.domain.AccountDto;
import com.example.corespringsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/mypage")
    public String myPage() throws Exception {
        return "user/mypage";
    }

    @GetMapping("/users")
    public String createUser() {
        return "user/login/register";
    }

    @PostMapping("/users")
    public String createUser(AccountDto accountDto) {
        Account account = Account.createAcount(
                accountDto.getUsername(),
                accountDto.getPassword(),
                accountDto.getEmail(),
                accountDto.getAge(),
                accountDto.getRole());
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        userService.createUser(account);
        return "redirect:/";
    }
}
