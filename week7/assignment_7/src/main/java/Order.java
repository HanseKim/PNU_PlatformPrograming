import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();

    private static int orderCounter = 1;
    private int orderNo = 0;

    private Order.PickUp delivery;

    public void addItem(OrderItem item) {
        items.add(item);
        orderCounter++;
    }

    public void setPickUp(PickUp pickUp) {
        delivery = pickUp;
    }

    public void completed() {
        orderNo++;
    }
    public int getOrderNo(){ return orderNo;}
    @Override
    public String toString(){
        String str="";
        for(int i=0;i< items.size();i++){
            if(i==items.size()-1) str+=String.format("%s",items.get(i));
            else
                str+=String.format("%s, ",items.get(i));
        }
        str+="]";
        return str;
    }

    public static interface PickUp {
        public abstract void handle(Order o);
    }

}