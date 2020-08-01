package com.thacker.passlockr.recordentry;

import com.thacker.passlockr.password.Password;
import com.thacker.passlockr.securetitle.SecureTitle;

import java.io.Serializable;

/**
 * Stores a complete record consisting of a title and a password
 */
public class Record implements Serializable {
    private SecureTitle title;
    private Password pass;
    private long id;

    /**
     * CONSTRUCTOR, sets the title and password for the record
     * @param title the title of the record
     * @param pass  the password for the record, in plaintext
     * @param key   the string used to encrypt the title and password, basically the user's password
     */
    public Record(String title, String pass, String key){
        this.title = new SecureTitle(title, key, id);
        this.pass = new Password(pass, key, id);
    }

    /**
     * Return the title of the record
     * @return  the title of the record, in plaintext
     */
    public String getTitle(){
        return this.title.getTitle();
    }

    /**
     * Return the password for the record
     * @return  the password of the record, in plaintext
     */
    public String getPass(){
        return this.pass.getPass();
    }
}
