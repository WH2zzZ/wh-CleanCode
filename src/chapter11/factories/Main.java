package chapter11.factories;

/**
 * Main模块
 * @author ASCE1885
 *
 */
public class Main {
	
	public static void main(String[] args) {
		LineItemFactory lif = new LineItemFactoryImpl();
		OrderProcessing op = new OrderProcessing(lif);
		op.run();
	}
 
}