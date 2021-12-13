package edu.isu.assg4.adapter;

public class DBFactory {
    
    public enum DBType{
        MySQL, MSSQL, NoSQL;
    }

    public static DBOperations getDB(DBType type){
        if(type == DBType.MSSQL)
            return new MSSQL();
        else if(type == DBType.MySQL)
            return new MySQL();
        else if (type == DBType.NoSQL)
            return new NoSQL();
        
        return null;
    }
}
