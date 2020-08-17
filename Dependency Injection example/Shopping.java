public class Shopping {
    public static void main(String arg[])
    {
        Product p1 = new Product("Apple ipad", 38000.00);
        Customer c1 = new Customer("Ethan Hunt",p1);
        c1.showDetails();
    }
}