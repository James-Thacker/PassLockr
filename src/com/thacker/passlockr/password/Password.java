package com.thacker.passlockr.password;

import java.io.Serializable;

/**
 * Stores an encrypted password
 */
public class Password implements Serializable {
    private String pass;

    /**
     * CONSTRUCTOR, set the password
     * @param pass  the password to be encrypted, in plaintext
     * @param key   string used along with id to encrypt the password
     * @param id    record id number used along with key to encrypt the password
     */
    public Password(String pass, String key, long id){
        //NOTE the encryption part has yet to be implemented
        this.pass = pass;
    }

    public String getPass(){
        //NOTE the encryption part has yet to be implemented
        return this.pass;
    }
}
