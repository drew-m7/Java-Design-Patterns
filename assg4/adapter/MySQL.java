package edu.isu.assg4.adapter;

public class MySQL implements DBOperations{

    @Override
    public boolean save(Object data) {
        System.out.println("Saved the data to MySQL sucessfully");
        return true;
    }

    @Override
    public Object retrive() {
        System.out.println("Retrived the data from MySQL sucessfully");    
        return null;
    }

    @Override
    public boolean connect(String connectionString) {
        System.out.println("Connected to MySQL sucessfully");    
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Disconnected to MySQL sucessfully");    
        return true;
    }
    
}
