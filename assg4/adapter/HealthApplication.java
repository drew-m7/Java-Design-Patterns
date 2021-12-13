package edu.isu.assg4.adapter;

import java.util.ArrayList;
import java.util.List;
import edu.isu.assg4.adapter.DBFactory.DBType;

/**
 * Adapter
 */
public class HealthApplication implements AdapterInterface{

    List<DBOperations> connections = new ArrayList<DBOperations>();
    
    HealthApplication(){
        this.connections.add(DBFactory.getDB(DBType.MSSQL));
        this.connections.add(DBFactory.getDB(DBType.MySQL));
        this.connections.add(DBFactory.getDB(DBType.NoSQL));
    }

    public void startSession(){
        for(DBOperations op: this.connections){
            op.connect("Connection Strings");
        }
    }
    
    public void save(Object data) {
        for(DBOperations op:connections)
            op.save(data);
    }
    
    public Object retrive() {
        Object temp = null;
        for(DBOperations op:connections)
            // Write to logic to aggregate the data into temp
            op.retrive();
        return temp;
    }
    
    public void endSession(){
        for(DBOperations op: this.connections){
            op.disconnect();
        }
    }    
}
