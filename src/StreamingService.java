public class StreamingService extends Service implements PremiumFeature {

    public StreamingService(String serviceName, int serviceID) {
            super(serviceName, serviceID);
        }

        @Override
        public void performService() {
            if (isActive) {
                System.out.println("StreamingService: Playing 4K video content...");
            } else {
                System.out.println("StreamingService: Service is inactive. Cannot stream.");
            }
        }

        @Override
        public void upgradeToPremium() {
            System.out.println("StreamingService: Upgraded to 4K Ultra HD Premium Plan.");
        }
}