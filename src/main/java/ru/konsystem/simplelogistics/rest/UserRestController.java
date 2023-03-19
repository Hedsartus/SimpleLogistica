package ru.konsystem.simplelogistics.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.konsystem.simplelogistics.services.UserService;

import java.security.Principal;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserRestController {
    private final UserService userService;

    @GetMapping("/list")
    public Object showAllFiles(@RequestParam("limit") int limit, Principal principal) {
        long userId = userService.findByUsername(principal.getName()).getId();
        return null;
    }

}
