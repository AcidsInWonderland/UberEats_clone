import java.io.*;
import java.util.*;
public class Database {

	ArrayList<Restos> allRestos = new ArrayList<Restos>();
    ArrayList<Restos> kenilworthRestos = new ArrayList<Restos>();
    ArrayList<Restos> seapointRestos = new ArrayList<Restos>();
    ArrayList<Restos> rondeboschRestos = new ArrayList<Restos>();
    FileWriter csvWriter;


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
        int lineNo = 0;
    try {
           br = new BufferedReader(new FileReader("UberEats_clone-1\\bin\\restos.csv"));//fr);
           
           while ((line = br.readLine()) != null) {
               if(lineNo == 0) {
                lineNo++;
               } else {
                String[] data = line.split(cvsSplitBy);
                ArrayList<Dishes> dishes = new ArrayList<Dishes>();
                Orders o = new Orders();
                Restaurant restaurant = new Restaurant();
                dishes.add(new Dishes(data[1].trim(), Integer.parseInt(data[2].trim())));
                dishes.add(new Dishes(data[3].trim(), Integer.parseInt(data[4].trim())));
                dishes.add(new Dishes(data[5].trim(), Integer.parseInt(data[6].trim())));  
                o.setOrder(dishes);
                o.setLocationName( data[7]);
                restaurant.setName(data[0]);
                Restos restos = new Restos(o, restaurant);      
                this.allRestos.add(restos);    
            }
        }  
    } catch (Exception e) {
            System.out.println(" Error" + e);
        }
    }

    public ArrayList<Restos> getKenilworthRestos(){
        for (Restos r : this.allRestos) {
          if ( r.getOrders().getLocationName().toLowerCase().equals("kenilworth")) {
              this.kenilworthRestos.add(r);
          }
      }
      return this.kenilworthRestos;
  }

    public ArrayList<Restos> getSeapointRestos() {
        for (Restos r : this.allRestos) {
            if ( r.getOrders().getLocationName().trim().toLowerCase().equals("seapoint")) {
                this.seapointRestos.add(r);
            }
        }
        return this.seapointRestos;
    }
    

    public ArrayList<Restos> getRondeboschRestos() {
        for (Restos r : this.allRestos) {
            if (r.getOrders().getLocationName().toLowerCase().equals("rondebosch")) {
                this.rondeboschRestos.add(r);
            }
        }
        return this.rondeboschRestos;
    }
    


    public ArrayList<Restos> getAllRestos() {
        for (Restos r : this.allRestos) {
            if (r.getOrders().getLocationName().toLowerCase().equals("all")) {
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