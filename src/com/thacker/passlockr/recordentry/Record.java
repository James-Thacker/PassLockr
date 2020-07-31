package com.thacker.passlockr.recordentry;

import com.thacker.passlockr.password.Password;
import com.thacker.passlockr.securetitle.SecureTitle;

/**
 * Stores a complete record consisting of a title and a password
 */
public class Record {
    private SecureTitle title;
    private Password pass;

    /**
     * CONSTRUCTOR, sets the title and password for the record
     * @param title the title of the record
     * @param pass  the password for the record, in plaintext
     */
    public Record(String title, String pass){
        this.title = new SecureTitle(title);
        this.pass = new Password(pass);
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
