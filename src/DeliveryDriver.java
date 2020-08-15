public class DeliveryDriver {

    //instance variables
    Vehicle motobike;
    String licenseID;
    
    //constructor
    DeliveryDriver(Vehicle motobike, String licenseID, String name, String surname,String phone_number){
        super(name,surname,phone_number,cash);   
        this.motobike = motobike;
        this.licenseID = licenseID;    
    }


    //methods

    //setters
    public void setVehicle(Vehicle motobike){
        this.car = car;
    }

    public void setlicenseID(String licenseID){
        this.licenseID = licenseID;
    }

    public Vehicle getMotobike(){
        return this.motobike;
    }

    public String getlicenseID(){
        return  this.licenseID;
    }

    public String toString(){
        return super.toString() + " I deliver to your door";
    }
    
    
    
}