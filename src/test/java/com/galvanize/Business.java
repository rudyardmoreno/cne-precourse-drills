package com.galvanize;

/*  cne-precourse-curriculum
    Dish Network
    03/13/2017  Rudyard Moreno  First created
    Step 3: Java Programming
    Business Class
*/

import java.util.ArrayList;
import java.util.List;

public abstract class Business implements Addressable{

	// properties
    private String name;
	private ArrayList<Address> addresses = new ArrayList<Address>();

    public String getName() {
      return name;
    }
    
    private void setName( String newName) {
      name = newName;
    }
    
    @Override 
    public List<Address> getAddresses() {
     return addresses;
    }    
     
    @Override 
    public void addAddress(Address address) {
      addresses.add(address);
    }   
  
    // Constructor
    public Business(String name) {
      setName(name);
    }   
}