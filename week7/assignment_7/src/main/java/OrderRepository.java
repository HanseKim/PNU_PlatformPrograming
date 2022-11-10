import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderRepository implements Iterator<Order> {
    List<Order> orders = new ArrayList<>();
    private int ordersNum=0;
    private int num=0;
    @Override
    public boolean hasNext() {
        if(ordersNum >= orders.size()) return false;
        else return true;
    }

    @Override
    public Order next() {
        return orders.get(++ordersNum);
    }

    public void add(Order order) {
        orders.add(order); num++;
    }
    // your code here

    @Override
    public String toString(){
        String str = String.format("--- 주문 관리자 화면 ---\n" + "현재 주문수는 총 %d 입니다.",num);
        str+="\n\n";
        for(int i=0;i<num;i++){
            if(i==0) i=orders.get(i).getOrderNo();
            str+=String.format("주문번호: %d - [%s\n",i+1,orders.get(i));
        }
        str+="\n\n";
        return str;
    }
}