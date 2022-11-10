public class PickUpFactory {
    class Delivery implements Order.PickUp {
        private String address;

        public Delivery(String address) {
            this.address = address;
        }

        @Override
        public void handle(Order o) {

        }
        // your code here
    }
    class DriveThru implements Order.PickUp {
        private String vehicleNumber;

        public DriveThru(String vehicleNumber) {
            this.vehicleNumber = vehicleNumber;
        }

        @Override
        public void handle(Order o) {

        }
        // your code here
    }
    class TakeOut implements Order.PickUp {
        @Override
        public void handle(Order o) {

        }
        // your code here
    }
    public Order.PickUp makeTakeOut (){
        return new TakeOut();
    }
    public Order.PickUp makeDriveThru (String vehicleNumber){
        return new DriveThru(vehicleNumber);
    }
    public Order.PickUp makeDelivery (String address){
        return new Delivery(address);
    }

}