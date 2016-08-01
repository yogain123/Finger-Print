package com.example.ws;

import javax.jws.WebService;

@WebService
public class terminal {
	
	public String getminutie(String image){
		
		brain b = new brain();
		
		//return b.getImage(image);
		try {
			return b.getImage(image);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
