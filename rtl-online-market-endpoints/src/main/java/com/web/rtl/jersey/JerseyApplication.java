package com.web.rtl.jersey;

import org.glassfish.jersey.server.ResourceConfig;

import com.web.rtl.endpoints.ProductsService;
import com.web.rtl.endpoints.TestRestService;

public class JerseyApplication extends ResourceConfig{
	
	public JerseyApplication() {
		register(TestRestService.class);
		register(ProductsService.class);
	}

}
