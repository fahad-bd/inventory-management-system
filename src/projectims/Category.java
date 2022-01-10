
package projectims;

/**
 *
 * @author Fahad Ahammed
 */
public class Category {
    protected String catName;

    public Category() {
    }

    public Category(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "Category{" + "catName=" + catName + '}';
    }

    
}
