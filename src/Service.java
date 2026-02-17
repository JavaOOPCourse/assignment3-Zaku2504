public abstract class Service {

    protected String serviceName;
    protected int serviceID;
    protected boolean isActive;

    public Service(String serviceName, int serviceID) {
        this.serviceName = serviceName;
        this.serviceID = serviceID;
        this.isActive = false; // По умолчанию выключен
    }

    public void activateService() {
        isActive = true;
        System.out.println(serviceName + " is now ACTIVE.");
    }

    public void deactivateService() {
        isActive = false;
        System.out.println(serviceName + " is now INACTIVE.");
    }

    public String getServiceName() {
        return serviceName;
    }

    public abstract void performService();
}
