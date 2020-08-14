public class Orders {

    //instance variables
    private String name;
    private String signaturedish1;
    private int cost1;
    private String signaturedish2;
    private int cost2;
    private String signaturedish3;
    private int cost3;
    private String location;

    //constructor
    Orders(String name, String signaturedish1, int cost1, String signaturedish2, int cost2, String signaturedish3, int cost3, String location) {
        this.name = name;
        this.signaturedish1 = signaturedish1;
        this.cost1 = cost1;
        this.signaturedish2 = signaturedish2;
        this.cost2 = cost2;
        this.signaturedish3 = signaturedish3;
        this.cost3 = cost3;
        this.location = location;
    }


    //methods

    //getters & setters
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSignaturedish1() {
        return this.signaturedish1;
    }
    public void setSignaturedish1(String signaturedish1) {
        this.signaturedish1 = signaturedish1;
    }

    public int getCost1() {
        return this.cost1;
    }
    public void setCost1(int Cost1){
        this.cost1 = cost1;
    }

    public String getSignaturedish2() {
        return this.signaturedish2;
    }
    public void setSignaturedish2(String signaturedish2) {
        this.signaturedish2 = signaturedish2;
    }

    public int getCost2() {
        return this.cost2;
    }
    public void setCost2(int Cost2){
        this.cost2 = cost2;
    }

    public String getSignaturedish3() {
        return this.signaturedish3;
    }
    public void setSignaturedish3(String signaturedish3) {
        this.signaturedish3 = signaturedish3;
    }

    public int getCost3() {
        return this.cost3;
    }
    public void setCost3(int Cost3){
        this.cost3 = cost3;
    }

    public String getLocation() {
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }


}


