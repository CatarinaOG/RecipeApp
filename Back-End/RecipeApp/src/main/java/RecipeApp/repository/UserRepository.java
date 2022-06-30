package RecipeApp.repository;

import RecipeApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("FROM User WHERE username = ?1")
    User getUser(String username);

}
