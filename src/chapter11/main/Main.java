package chapter11.main;

/**
 * Main模块
 *
 */
public class Main {
 
	public static void main(String[] args) {
		//创建Builder对象
		Builder builder = new Builder();
		ConfiguredObject co = builder.createConfiguredObject("R3","C02");
		
		//创建Application对象
		Application app = new Application();
		app.run(co);
	}
}