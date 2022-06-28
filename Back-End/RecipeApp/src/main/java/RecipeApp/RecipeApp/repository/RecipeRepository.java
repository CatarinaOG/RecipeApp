package RecipeApp.RecipeApp.repository;

import RecipeApp.RecipeApp.model.Recipe;
import RecipeApp.RecipeApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Integer> {

}
