
package projectims;

/**
 * @author Fahad Ahammed
 */
public class Cash extends Payment{
    private double CashTendered;

    

    public Cash(double CashTendered, double totalAmount ) {
        super(totalAmount);
        this.CashTendered = CashTendered;
    }

    public double getCashTendered() {
        return CashTendered;
    }

    public void setCashTendered(double CashTendered) {
        this.CashTendered = CashTendered;
    }

    

}
