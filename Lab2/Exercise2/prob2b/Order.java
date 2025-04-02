package Lab2.Exercise2.prob2b;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private List<OrderLine> orderLines=new ArrayList<>();
    public Order(int orderNum,String orderItemName){
        this.orderNum=orderNum;
        this.orderLines.add(new OrderLine(orderItemName,this));
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void addOrderLine(String orderItemName){
        this.orderLines.add(new OrderLine(orderItemName,this));
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum=" + orderNum +
                ", orderLines=" + orderLines +
                '}';
    }
}
