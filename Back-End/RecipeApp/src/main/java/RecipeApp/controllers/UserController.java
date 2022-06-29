package RecipeApp.controllers;

import RecipeApp.Services.Services;
import RecipeApp.model.User;
import RecipeApp.repository.UserRepository;
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

    @PostMapping(value = "/load")
    public void persist(@RequestBody final User user){
        services.saveUser(user);
    }



}
