public class Driver extends Person {

    //instance variables
    String licenseID;

     //constructor
   Driver(String licenseID, String name, String surname, String phone_number, int cash) {
       super(name, surname, phone_number, cash);
       this.licenseID = licenseID;
       

   }

   //setters

   public void setlicenseID(String licenseID){
       this.licenseID = licenseID;
   }

   public String getSurname() {
       return null;
   }

   public String getlicenseID(){
       return  this.licenseID;
   }

   public String toString(){
       return super.toString() + " and I am a driver";
   }
   
}