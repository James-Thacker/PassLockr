package com.thacker.passlockr.securetitle;

import java.io.Serializable;

/**
 * Stores the title of a record securely via encryption
 * Plan is to encrypt the title with a user key which will be different for each user
 */
public class SecureTitle implements Serializable {
    private String title;

    /**
     * CONSTRUCTOR, sets title
     * @param title name of the record, in plaintext
     * @param key   string used along with id to encrypt the title
     * @param id    record id number used along with key to encrypt the title
     */
    public SecureTitle(String title, String key, long id){
        //NOTE the encryption part has yet to be implemented
        this.title = title;
    }

    /**
     * Returns the title
     * @return
     */
    public String getTitle(){
        //NOTE the encryption part has yet to be implemented
        return this.title;
    }
}
