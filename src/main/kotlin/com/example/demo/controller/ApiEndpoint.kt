package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiEndpoint {
    @GetMapping("/user")
    fun getUser(): String {
        return ("<h1>Hello user!</h1>")
    }

    @GetMapping("/admin")
    fun getAdmin(): String {
        return ("<h1>Hello Admin!</h1>")
    }

    @GetMapping("/")
    fun getRoot(): String {
        return ("<h1>Welcome!</h1>")
    }
}
