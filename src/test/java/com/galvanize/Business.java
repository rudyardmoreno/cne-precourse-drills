package com.galvanize;

/*  cne-precourse-curriculum
    Dish Network
    03/13/2017  Rudyard Moreno  First created
    Step 3: Java Programming
    Business Class
*/

public abstract class Business implements Addressable{

	// properties
    private final String name;
	private final ArrayList<Address> addresses = new ArrayList<Address>();

    public int getName() {
      return name;
    }
    
    private void setName( int newName) {
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