package edu.isu.assg4.adapter;

/**
 * Interface to define database operations.  
 */
public interface DBOperations {

    public boolean save(Object data);

    public Object retrive();

    public boolean connect(String connectionString);

    public boolean disconnect();
    
}
