public class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Admin " + name + " is configuring service: " + s.getServiceName());
        s.activateService();
    }

    @Override
    public void useService(Service s) {
        System.out.println("Admin " + name + " is testing service: " + s.getServiceName());
        s.performService();
    }
}