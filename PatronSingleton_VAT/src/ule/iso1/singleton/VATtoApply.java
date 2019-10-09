package ule.iso1.singleton;



public class VATtoApply {

   private static VATtoApply uniqueInstance;
   
    private double vatType;
   
    /**
     * MODIFICAR PARA CONSEGUIR QUE SEA SINGLETON
     */

    private VATtoApply(double vat) {
    	vatType=vat;
    }
  
   public static VATtoApply getInstance(double vat) {
	   
	   if(uniqueInstance == null) {
		   
		   	uniqueInstance = new VATtoApply(vat);
	   }
	   return uniqueInstance;
   }

	public double getVatType() {
		return vatType;
	}

	public void setVatType(double vatType) {
		this.vatType = vatType;
	}

}