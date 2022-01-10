
package projectims;

import sun.security.util.Password;

/**
 *
 * @author Fahad Ahammed
 */
public class CreditCard extends Payment{
    private String creditNumber;
    private static final String password = "abcd";

    public CreditCard() {
    }

    
    
    public CreditCard(String creditNumber, double totalAmount) {
        super(totalAmount);
        this.creditNumber = creditNumber;
    }

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public String getPassword() {
        return password;
    }

   

    
}
