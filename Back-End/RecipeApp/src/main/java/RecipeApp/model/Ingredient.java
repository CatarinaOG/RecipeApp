package RecipeApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue

    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Ingredient(){
    }

    public Ingredient(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
