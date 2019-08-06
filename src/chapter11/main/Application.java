package chapter11.main;

/**
 * 具体某个应用程序模块，需要ConfiguredObject对象实例才能运行
 * @author ASCE1885
 *
 */
public class Application {
	
	private ConfiguredObject configuredObject;
	
	public void run(ConfiguredObject co) {
		configuredObject = co;
		System.out.println("MajorVersion is : " + co.getMajorVersion());
		System.out.println("MinorVersion is : " + co.getMinorVersion());
	}
 
}