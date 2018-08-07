package com.n8ify.genpass.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources(value = {@PropertySource("application.properties"), @PropertySource("resources.properties")})
public class ResourceProperties {
	
	@Value("${app.name:Genpass}")
	public String appName;
	
	@Value("${app.version:Not Available}")
	public String appVersion;

	@Value("${app.modified:Not Available}")
	public String appModifiedDate;
}
