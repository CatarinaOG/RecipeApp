package RecipeApp.RecipeApp.Services;

import RecipeApp.RecipeApp.model.Recipe;
import RecipeApp.RecipeApp.model.User;
import RecipeApp.RecipeApp.repository.RecipeRepository;
import RecipeApp.RecipeApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {

    @Autowired
    private UserRepository userRep;

    @Autowired
    private RecipeRepository recipeRep;


    //------------------------------------------User-------------------------------------------
    public List<User> findAll(){
        return userRep.findAll();
    }

    public void saveUser(User user){
        userRep.save(user);
    }

    //------------------------------------------Recipe-------------------------------------------

    public List<Recipe> findAllRecipes(){
        return recipeRep.findAll();
    }

    public void loadRecipe(Recipe recipe){
        recipeRep.save(recipe);
    }


}
