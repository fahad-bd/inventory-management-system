
package projectims;

/**
 *
 * @author Fahad Ahammed
 */
public class Customer {
    private String cusName;
    private String cusAddress;
    private long cusPhone;

    public Customer(String cusName, String cusAddress, long cusPhone) {
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.cusPhone = cusPhone;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public long getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(long cusPhone) {
        this.cusPhone = cusPhone;
    }

    @Override
    public String toString() {
        return "Customer{" + "cusName='" + cusName + '\'' + ", cusAddress='" + cusAddress + '\'' + ", cusPhone=" + cusPhone + '}';
    }
}
