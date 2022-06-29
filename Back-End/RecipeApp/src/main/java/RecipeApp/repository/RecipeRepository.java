package RecipeApp.repository;

import RecipeApp.model.Recipe;
import RecipeApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Integer> {

}
