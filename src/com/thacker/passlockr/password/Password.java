package com.thacker.passlockr.password;

/**
 * Stores an encrypted password
 */
public class Password {
    private String pass;

    /**
     * CONSTRUCTOR, set the encrypted password
     * @param pass  the password to be encrypted
     */
    public Password(String pass){
        //NOTE the encryption part has yet to be implemented
        this.pass = pass;
    }

    public String getPass(){
        //NOTE the encryption part has yet to be implemented
        return this.pass;
    }
}
