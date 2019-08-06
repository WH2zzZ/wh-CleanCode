package chapter11.main;

/**
 * 某配置对象，供Applicaton使用，由Builder创建
 *
 */
public class ConfiguredObject {
	
	private String majorVersion;
	private String minorVersion;
	
	public String getMajorVersion() {
		return majorVersion;
	}
 
	public void setMajorVersion(String majorVersion) {
		this.majorVersion = majorVersion;
	}
 
	public String getMinorVersion() {
		return minorVersion;
	}
 
	public void setMinorVersion(String minorVersion) {
		this.minorVersion = minorVersion;
	}
	
	public ConfiguredObject(String majorVersion, String minorVersion) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
	}
	
	public ConfiguredObject() {
		
	}
	
}