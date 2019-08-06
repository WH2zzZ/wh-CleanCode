package chapter11.factories;

/**
 * LineItem实体
 * @author ASCE1885
 *
 */
public class LineItem {
	
	private String name;
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public LineItem(String name) {
		this.name = name;
	}
	
}