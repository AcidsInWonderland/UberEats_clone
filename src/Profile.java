public class Profile {

    //instance variables
    String email;

    //constructor
    Profile(String email, String name, String surname,String mobile contact){
        super(name,surname,mobile_contact);
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