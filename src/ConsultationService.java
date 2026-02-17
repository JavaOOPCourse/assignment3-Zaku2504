public class ConsultationService extends Service implements Billable {

    public ConsultationService(String serviceName, int serviceID) {
        super(serviceName, serviceID);
    }

    @Override
    public void performService() {
        if (isActive) {
            System.out.println("ConsultationService: Соединение со специалистом для онлайн-консультации...");
        } else {
            System.out.println("ConsultationService: Ошибка. Консультация недоступна.");
        }
    }

    @Override
    public void generateBill() {
        System.out.println("ConsultationService: Сгенерирован счет за проведенную консультацию.");
    }
}