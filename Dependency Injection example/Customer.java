public class Customer {
    private String custName;
    private Product p ;

    public Customer(String custName, Product p)
    {
        this.custName = custName;
        this.p = p;
    }
    public void showDetails()
    {
        System.out.println("Customer name: "+custName);
        p.getDetails();
    }
}