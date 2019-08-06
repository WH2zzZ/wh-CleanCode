package chapter11.factories;

/**
 * 具体工厂类
 * @author ASCE1885
 *
 */
public class LineItemFactoryImpl implements LineItemFactory {
	
	private LineItem lineItem;
 
	@Override
	public LineItem makeLineItem(String name) {
		if (null == lineItem) {
			lineItem = new LineItem(name);
		}
		return lineItem;
	}
 
}