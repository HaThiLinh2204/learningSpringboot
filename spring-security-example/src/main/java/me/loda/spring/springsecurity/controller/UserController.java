package me.loda.spring.springsecurity.controller;

import me.loda.spring.springsecurity.entity.User;
import me.loda.spring.springsecurity.model.dto.UseDto;
import me.loda.spring.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/users")
public class UserController {

    @GetMapping(value = {"/", "/home"})
    public String homepage() {
        return "home";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/users/search", method = RequestMethod.GET )
//    @GetMapping("/users/search")
    public ResponseEntity<?> searchUser(@RequestParam(name = "keyword",required = false,defaultValue = "") String name){
        List<UseDto> users = userService.searchUser(name);
        return ResponseEntity.ok(users);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET )
//    @GetMapping("")
    public ResponseEntity<?> getListUser(){
        List<UseDto> users = userService.getListUser();
       return ResponseEntity.ok(users);
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET )
//    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id){
        UseDto result = userService.getUserById(id);
        return ResponseEntity.ok(result);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/users/add", method = RequestMethod.POST )
//    @PostMapping("/add")
    public ResponseEntity<?> createUser(@RequestBody User user){
        ArrayList result = userService.createUser(user);
        return ResponseEntity.ok(result);
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT )
//    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@RequestBody User newuser, @PathVariable int id){
        User user = userService.updateUser(newuser,id);
        return ResponseEntity.ok(user);
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE )
//    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id){
        boolean result = userService.deleteUser(id);
        return ResponseEntity.ok(result);
    }
}
