import java.io.*;
import java.util.*;
public class Database {

	ArrayList<Restos> allRestos = new ArrayList<Restos>();
    ArrayList<Restos> kenilworthRestos = new ArrayList<Restos>();
    ArrayList<Restos> seapointRestos = new ArrayList<Restos>();
    ArrayList<Restos> rondeboschRestos = new ArrayList<Restos>();
    FileWriter csvWriter;
    private ArrayList<Dishes> dishes;

    Database() {
        try {
            this.csvWriter = new FileWriter("orders.csv");
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public void readFromCSV(String filename) throws IOException {
        BufferedReader br = null;
        String line = " ";
        String cvsSplitBy = ",";
        String restaurantLocation = "";
        String resturantName = "";
    try {
           br = new BufferedReader(new FileReader("./bin/restos.csv"));//fr);
           Orders o = new Orders();
           Restaurant restaurant = new Restaurant(resturantName);
           while ((line = br.readLine()) != null) {
               String[] data = line.split(cvsSplitBy);
               restaurantLocation = data[7];
               resturantName = data[0];
               for(int i = 0; i < 3; i++) {
                int j = 2*i;
                dishes.add(new Dishes(data[j+1].trim(), Integer.parseInt(data[j+2].trim())));	
            }
            o.setOrder(dishes);
            o.setLocationName(restaurantLocation);
            restaurant.setName(resturantName);
            Restos restos = new Restos(o, restaurant);
            this.allRestos.add(restos);
        }  
    } catch (Exception e) {
            System.out.println(" Error" + e);
        }
    }

    public ArrayList<Restos> getKenilworthRestos(){
        for (Restos r : this.allRestos) {
          if (((Orders) r.getOrders).getLocationName().equals("Kenilworth")) {
              this.kenilworthRestos.add(r);
          }
      }
      return this.kenilworthRestos;
  }

    public ArrayList<Restos> getSeapointRestos() {
        for (Restos r : this.allRestos) {
            if (((Orders) r.getOrders).getLocationName().equals("Seapoint")) {
                this.seapointRestos.add(r);
            }
        }
        return this.seapointRestos;
    }
    

    public ArrayList<Restos> getRondeboschRestos() {
        for (Restos r : this.allRestos) {
            if (((Orders) r.getOrders).getLocationName().equals("Rondebosch")) {
                this.rondeboschRestos.add(r);
            }
        }
        return this.rondeboschRestos;
    }
    


    public ArrayList<Restos> getAllRestos() {
        for (Restos r : this.allRestos) {
            if (((Orders) r.getOrders).getLocationName().equals("all")) {
                this.allRestos.add(r);
            }
        }
        return this.allRestos;
    }
    

	public void WritetoCSV(Restos restos) {

    }


	public void closeFileWriting() {
	} 
}