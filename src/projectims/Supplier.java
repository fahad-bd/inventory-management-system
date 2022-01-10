
package projectims;

import java.io.Serializable;

/**
 *
 * @author Fahad Ahammed
 */
public class Supplier implements Serializable{
    private String supName;
    private String supPhone;

    public Supplier(String supName, String supPhone) {
        this.supName = supName;
        this.supPhone = supPhone;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getSupPhone() {
        return supPhone;
    }

    public void setSupPhone(String supPhone) {
        this.supPhone = supPhone;
    }

    public void order(){

    }

    @Override
    public String toString() {
        return "Supplier{" + "supName=" + supName + ", supPhone=" + supPhone + '}';
    }

    
}
