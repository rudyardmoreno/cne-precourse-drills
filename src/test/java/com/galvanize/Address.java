package com.galvanize;

/*  cne-precourse-curriculum
    Dish Network
    03/13/2017  Rudyard Moreno  First created
    Step 3: Java Programming
    Address Class
*/

public class Address {
   private String street;
   private String city;
   private String state;
   private String zip;

   // Getters
   public String getStreet() {
      return street;
   }

   public String getCity() {
      return city;
   }
   
   public String getState() {
      return state;
   }

   public String getZip() {
      return zip;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   // Setters 
   public void setStreet(String newStreet) {
      street = newStreet;
   }

   public void setCity(String newCity) {
      city = newCity;
   }

   public void setState(String newState) {
      state = newState;
   }

   public void setZip(String newZip) {
      zip = newZip;
   }
   
   // Constructor
   public Address(String pStreet, String pCity, String pState, String pZip) {
      setAge(pStreet);
      setCity(pCity);
      setState(pState);
      setZip(pZip);
   }
   
   // Override toString method
  @Override 
      public String toString() {
        String result;

        result = getStreet() + "," + getCity() + "," + getState() + "," + getZip();

        return result.toString();
      }   
   
}