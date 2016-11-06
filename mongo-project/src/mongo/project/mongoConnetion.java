/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongo.project;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import java.util.List;


/**
 *
 * @author Andrea
 */
public class mongoConnetion {

    private final DB db;
    private DBObject options;
   
    
    
    
    
     public mongoConnetion() {
       
         Mongo mongo =  new Mongo();
         db=mongo.getDB("basenombres");
         db.createCollection("Nombres", options);
         
 
    }
     
     
     public static void printDatabases(MongoClient mongo) {
        List dbs = mongo.getDatabaseNames();
        for (Object db : dbs) {
            System.out.println(" - " + db);
        }
    }
}
