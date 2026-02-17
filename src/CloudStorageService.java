public class CloudStorageService extends Service implements PremiumFeature, Billable {

    private boolean isPremium = false;

    public CloudStorageService(String serviceName, int serviceID) {
        super(serviceName, serviceID);
    }

    @Override
    public void performService() {
        if (isActive) {
            String status = isPremium ? "Премиум" : "Стандарт";
            System.out.println("CloudStorageService: Синхронизация файлов в облаке (Режим: " + status + ")...");
        } else {
            System.out.println("CloudStorageService: Ошибка. Сервис не активирован.");
        }
    }

    @Override
    public void upgradeToPremium() {
        this.isPremium = true;
        System.out.println("CloudStorageService: Лимит хранилища увеличен до 10 ТБ!");
    }

    @Override
    public void generateBill() {
        double cost = isPremium ? 15.99 : 9.99;
        System.out.println("CloudStorageService: Сгенерирован счет на сумму $" + cost);
    }
}