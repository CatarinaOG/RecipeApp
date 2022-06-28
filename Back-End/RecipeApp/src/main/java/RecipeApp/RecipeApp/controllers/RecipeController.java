package RecipeApp.RecipeApp.controllers;

import RecipeApp.RecipeApp.Services.Services;
import RecipeApp.RecipeApp.model.Recipe;
import RecipeApp.RecipeApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "recipe")

public class RecipeController {

    @Autowired
    private Services services;

    @GetMapping(value = "/all")
    public List<Recipe> getAll(){
        return services.findAllRecipes();
    }

    @PostMapping(value = "/load")
    public void load(@RequestBody final Recipe recipe){
        services.loadRecipe(recipe);
    }

}
