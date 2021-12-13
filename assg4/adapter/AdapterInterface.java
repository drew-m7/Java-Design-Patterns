package edu.isu.assg4.adapter;
/**
 * Adapter Interface. This allows developers to define different adapters. 
 */
public interface AdapterInterface {
    public void startSession();
    
    public void save(Object data);
    
    public Object retrive();
    
    public void endSession();
}
