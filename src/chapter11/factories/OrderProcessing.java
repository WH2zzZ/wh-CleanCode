package chapter11.factories;

/**
 * 订单处理类，自行控制何时创建LineItem
 * @author ASCE1885
 *
 */
public class OrderProcessing {
	
	private LineItem lineItem;
	private LineItemFactory lineItemFactory;
	
	public OrderProcessing(LineItemFactory lif) {
		lineItemFactory = lif;
	}
	
	public void run() {
		lineItem = lineItemFactory.makeLineItem("ASCE1885");
		System.out.println("The name of lineItem is : " + lineItem.getName());
	}
 
}