package hu.meza.tools.config;

public class ConfigurationNotFoundException extends RuntimeException {
	public ConfigurationNotFoundException(String configKey) {
		super(String.format("Could not find configuration key: %s", configKey));
	}
}
