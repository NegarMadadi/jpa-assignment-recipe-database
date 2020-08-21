package se.lexicon.negar.jpaassignmentrecipedatabase.entity;

import java.util.List;
import java.util.Objects;

public class RecipeCategory {

    private int categoryId;
    private String categoryName;
    private List<Recipe> recipes;

    public RecipeCategory() {
    }

    public RecipeCategory(int categoryId, String categoryName, List<Recipe> recipes) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.recipes = recipes;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return categoryId == that.categoryId &&
                Objects.equals(categoryName, that.categoryName) &&
                Objects.equals(recipes, that.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName, recipes);
    }

    @Override
    public String toString() {
        return "RecipeCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", recipes=" + recipes +
                '}';
    }
}
