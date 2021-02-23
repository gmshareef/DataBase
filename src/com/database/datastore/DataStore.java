package com.database.datastore;

import com.database.entities.DataBase;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    List<DataBase> dataBaseList = new ArrayList<>();

    public void setDataBase(int id, String name, int cost) {
        DataBase dataBase = new DataBase();
        dataBase.setId(id);
        dataBase.setName(name);
        dataBase.setCost(cost);
        dataBaseList.add(dataBase);

    }

//    public void printDataBase(){
//        setDataBase(111,"Ruby", 300000);
//        setDataBase(112, "Diamond", 300000);
//        setDataBase(113, "Gold", 50000);
//    }

    public List<DataBase> dataBaseList(){
        return  dataBaseList;
    }
}
