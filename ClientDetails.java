package org.client;

import org.test.CompanyDetails;

public class ClientDetails extends CompanyDetails {
	private void clientId() {
		System.out.println("client id is 009909");
	}
private void clientName() {
	System.out.println("client name is praveen");
}
public static void main(String[] args) {
	ClientDetails c=new ClientDetails();
	c.clientId();
	c.clientName();
	c.comId();
	c.comName();
	
}
}
