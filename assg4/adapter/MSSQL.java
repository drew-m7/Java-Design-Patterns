package edu.isu.assg4.adapter;

public class MSSQL implements DBOperations{

    @Override
    public boolean save(Object data) {
        System.out.println("Saved the data to MSSQL sucessfully");
        return true;
    }

    @Override
    public Object retrive() {
        System.out.println("Retrived the data from MSSQL sucessfully");    
        return null;
    }

    @Override
    public boolean connect(String connectionString) {
        System.out.println("Connected to MSSQL sucessfully");    
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Disconnected to MSSQL sucessfully");    
        return true;
    }
    
}
