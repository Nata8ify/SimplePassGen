package com.n8ify.genpass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.n8ify.genpass.component.ResourceProperties;
import com.n8ify.genpass.utils.LogUtil;

@Controller
public class HomeController {
	
	@Autowired 
	private ResourceProperties resourceProperties;
	
	@GetMapping("/")
	public ModelAndView home(ModelAndView modelAndView) {
		modelAndView = new ModelAndView("home");
		HomePageObject homePageObject = new HomePageObject();
		homePageObject.setAppName(resourceProperties.appName);
		homePageObject.setAppVersion(resourceProperties.appVersion);
		homePageObject.setAppModifiedDate(resourceProperties.appModifiedDate);
		modelAndView.addObject("homeObj", homePageObject);
		return modelAndView;
	}
	
	class HomePageObject{
		private String appName;
		private String appVersion;
		private String appModifiedDate;
		public String getAppName() {
			return appName;
		}
		public void setAppName(String appName) {
			this.appName = appName;
		}
		public String getAppVersion() {
			return appVersion;
		}
		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}
		public String getAppModifiedDate() {
			return appModifiedDate;
		}
		public void setAppModifiedDate(String appModifiedDate) {
			this.appModifiedDate = appModifiedDate;
		}
		
		
	}
}
