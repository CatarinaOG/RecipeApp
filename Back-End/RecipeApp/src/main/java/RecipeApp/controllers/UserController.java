package RecipeApp.controllers;

import RecipeApp.Services.Services;
import RecipeApp.model.LoginForm;
import RecipeApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")

public class UserController {

    @Autowired
    private Services services;

    @GetMapping(value = "/all")
    public List<User> getAll(){
        return services.findAll();
    }


    @PostMapping(value = "/login")
    @CrossOrigin
    public String loginUser(@RequestBody final LoginForm loginForm){
        boolean resp = services.loginUser(loginForm);

        return "{ \"login\" : " + resp + "}";
    }


}
