package com.thacker.passlockr.userentry;

import com.thacker.passlockr.password.Password;
import com.thacker.passlockr.recordentry.Record;
import com.thacker.passlockr.securetitle.SecureTitle;

import java.io.Serializable;
import java.util.HashMap;

public class User implements Serializable {
    private String username;
    private String pass;        //Change to hash
    private HashMap<String, Record> records;

    /**
     * Stores a user's records
     * @param username  the username of the user whose data this object stores, in plaintext
     * @param pass  the user's password, in plaintext
     */
    public User(String username, String pass){
        this.username = username;
        this.pass = pass;
        records = new HashMap<>();
    }

    /**
     * Add a new entry to the user's records database
     * @param name  the name of the record
     * @param pass  the password for the record
     */
    public void addEntry(String name, String pass){
        //Needs a better solution
        records.put(name, new Record(name, pass, this.pass));
    }

    /**
     * Return the specified record from the user's records database
     * @param name  the name of the specified record
     * @return  the specified record
     */
    public Record getRecord(String name){
        return records.get(name);
    }

    /**
     * Delete a record from the user's records database
     * @param name  the record to delete
     */
    public void deleteRecord(String name){
        records.remove(name);
    }

    /**
     * Deletes every record in the user's records database
     */
    public void deleteAllRecords(){
        records.clear();
    }

    /**
     * Return the number of records in the user's records database
     * @return  the number of stored records
     */
    public long getNumEntries(){
        return this.records.size();
    }
}
