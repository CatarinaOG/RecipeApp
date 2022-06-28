package RecipeApp.RecipeApp.repository;

import RecipeApp.RecipeApp.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {
}
