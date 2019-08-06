package chapter11.factories;

/**
 * 抽象工厂类
 * @author ASCE1885
 *
 */
public interface LineItemFactory {
	
	public LineItem makeLineItem(String name);
 
}