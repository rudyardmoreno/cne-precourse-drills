package com.galvanize;
import java.util.List;

/*  cne-precourse-curriculum
    Dish Network
    03/13/2017  Rudyard Moreno  First created
    Step 3: Java Programming
    Addressable Class
*/

public interface Addressable {
	public List<Address> getAddresses();
	public void addAddress(Address address);
}
