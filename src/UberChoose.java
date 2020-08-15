import java.util.*;

public class UberChoose {

    Database db;

    UberChoose() {
        this.db = new Database();
    }

    public ArrayList<Restos> getRestosByLocation(String location) {
        ArrayList<Restos> returnList;
        db.readFromCSV("restos.csv");
        if(location == "kenilworth") {
            returnList = db.getKenilworthRestos();
        }
        else if(location == "seapoint") {
            returnList = db.getSeapointRestos();
        }
        else if(location == "rondebosch") {
            returnList = db.getRondeboschRestos();
        }
        else {
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
