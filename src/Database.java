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

//        try {
//            br = new BufferedReader(new FileReader(filename));
//            while ((line = br.readLine()) != null) {
//                String[] data = line.split(cvsSplitBy);
//                if(i>0) {
//                    Orders o = new Orders(data[0], Integer.parseInt(data[1]), data[2], data[3], data[4]);

        Restos restos = new Restos(o, restaurant);
        this.allRestos.add(restos);
    }
}
