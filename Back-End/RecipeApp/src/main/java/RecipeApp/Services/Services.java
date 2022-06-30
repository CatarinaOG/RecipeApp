package RecipeApp.Services;

import RecipeApp.model.LoginForm;
import RecipeApp.model.Recipe;
import RecipeApp.model.User;
import RecipeApp.repository.RecipeRepository;
import RecipeApp.repository.UserRepository;
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

    public boolean loginUser(LoginForm loginForm){

        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

        User user = userRep.getUser(username);

        if(user == null) return false;

        System.out.print("nome: "+user.getName() + " pass:"+user.getPassword());

        return (user.getPassword().equals(password));
    }

    //------------------------------------------Recipe-------------------------------------------

    public List<Recipe> findAllRecipes(){
        return recipeRep.findAll();
    }

    public void loadRecipe(Recipe recipe){
        recipeRep.save(recipe);
    }


}
