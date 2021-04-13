package uz.sav.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uz.sav.crud.entity.UserEntity;
import uz.sav.crud.entity.template.ResponseData;
import uz.sav.crud.services.UserService;

import java.util.List;

@RequestMapping("/register")
@RestController
public class RegistrationController {

    @Autowired
    UserService userService;


    @GetMapping("/")
    public ResponseData<List<UserEntity>> getUsers() {
        return new ResponseData(userService.getAll());
    }

    @PostMapping("/save")
    public ResponseData save(@RequestBody UserEntity userEntity){
        return new ResponseData(userService.save(userEntity));
    }

}
