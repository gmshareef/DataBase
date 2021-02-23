package com.database;

import com.database.dao.Dao;
import com.database.datastore.DataStore;
import com.database.manager.Manager;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.printDataBase();
        manager.dataBaseList();
        manager.searchDataBase();
        manager.updateDataBase();
        manager.deleteDataBase();
        manager.dataBaseList();

    }
}
