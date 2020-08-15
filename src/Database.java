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

    public void readFromCSV(String filename) {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int i = 0;
        String restaurant = " ";
    try {
           br = new BufferedReader(new FileReader(filename));
           Orders o = new Orders();
           while ((line = br.readLine()) != null) {
               String[] data = line.split(cvsSplitBy);
               if(i>0) {
               }
            }
        Restos restos = new Restos(o, restaurant);
        this.allRestos.add(restos);
    } catch(Error e){

    }

    }

    public ArrayList<Restos> getKenilworthRestos(){
        // TODO: actually do this and change return type
        return kenilworthRestos;
        } 

    public ArrayList<Restos> getSeapointRestos() {
        // TODO: actually do this and change return type
        return seapointRestos;
        }

    public ArrayList<Restos> getRondeboschRestos() {
        // TODO: actually do this and change return type
        return rondeboschRestos;
        }


    public ArrayList<Restos> getAllRestos() {
        // TODO: actually do this and change return type
        return allRestos;
        }
}
