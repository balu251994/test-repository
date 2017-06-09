package com.hcp;

import org.glassfish.jersey.server.ResourceConfig;

public class WSConfig extends ResourceConfig{

	public WSConfig() {
		System.out.println("WSCONFIG hit");
		register(Service.class);
	}
}
