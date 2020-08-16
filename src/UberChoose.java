import java.io.IOException;
import java.util.*;

public class UberChoose {

    Database db;

    UberChoose() {
        this.db = new Database();
    }

    public ArrayList<Restos> getRestosByLocation(String location) throws IOException {
        ArrayList<Restos> returnList = new ArrayList<Restos>();
        db.readFromCSV("bin\\restos.csv");
        if(location.equals("kenilworth")) {
            returnList = db.getKenilworthRestos();
        }
        else if(location.equals("seapoint")) {
            returnList = db.getSeapointRestos();
        }
        else if(location.equals("rondebosch")) {
            returnList = db.getRondeboschRestos();
        }
        else if(location.equals("all")){
            returnList = db.getAllRestos();
        }

        return returnList;
    }

    public void submitRestosToDB(Restos restos) {
        this.db.WritetoCSV(restos);
    }

    public void closeConnectionToDB() {
        this.db.closeFileWriting();
    }
}
