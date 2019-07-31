package com.web.rtl.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.web.rtl.beans.Product;

@Path("/products")
public class ProductsService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getProducts() {
		Product pp = new Product();
		pp.setProductName("Hurray its working");
		return pp.getProductName();
	}
}
