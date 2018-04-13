package com.iqmsoft.controller

import com.iqmsoft.model.User
import org.springframework.http.HttpEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController {


    @ExceptionHandler
    HttpEntity error(Exception e) {
        def user = new User()
        user.username = "error"
        user.password = e.getMessage()
        return ResponseEntity.ok(user)
    }


    @RequestMapping(value = "/groovy", method = RequestMethod.GET)
    ResponseEntity home() {
        def user = new User()
        user.username = "username"
        user.password = "password"
        return ResponseEntity.ok(user)
    }


}
