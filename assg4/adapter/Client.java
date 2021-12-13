package edu.isu.assg4.adapter;

public class Client {

    public static void main(String[] args) {
        
        AdapterInterface ops = new HealthApplication();
        Object healthData = new Object();
        ops.save(healthData);

        healthData = ops.retrive();
    }
    
}
