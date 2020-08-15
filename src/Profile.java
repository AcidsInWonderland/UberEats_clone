public class Profile extends Person{

    private static double cash;
    // instance variables
    String email;

    //constructor
    Profile(String email, String name, String surname, String mobileContact){
        super(name,surname,mobileContact, cash);
        this.email = email;
    }


    //methods

    public void setEmail(String email){
        this.email  = email;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString(){
        return super.toString() + "Food lover";
    }

    
}