package chapter11.main;

/**
 * 负责创建ConfiguredObject
 *
 */
public class Builder {
	
	private ConfiguredObject configuredObject = null;
	
	//延迟初始化
	public ConfiguredObject createConfiguredObject(String majorVersion, String minorVersion) {
		if (null == configuredObject) {
			configuredObject = new ConfiguredObject(majorVersion, minorVersion);
		}
		return configuredObject;
	}
 
}