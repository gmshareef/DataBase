package com.database.dao;

import com.database.datastore.DataStore;
import com.database.entities.DataBase;

import java.util.List;

public class Dao {
    DataStore dataStore = new DataStore();

    public void printDataBase(){
        dataStore.printDataBase();
    }
    public List<DataBase> dataBaseList(){
        return dataStore.dataBaseList();
    }

}
