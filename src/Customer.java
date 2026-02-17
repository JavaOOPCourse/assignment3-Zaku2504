public class Customer extends User {
    public Customer(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println(name + " (Customer) cannot manage services.");
    }

    @Override
    public void useService(Service s) {
        System.out.println(name + " is using the service:");
        s.performService();
    }
}