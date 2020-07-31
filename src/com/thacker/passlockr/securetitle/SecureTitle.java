package com.thacker.passlockr.securetitle;

/**
 * Stores the title of a record securely via encryption
 * Plan is to encrypt the title with a user key which will be different for each user
 */
public class SecureTitle {
    private String title;

    /**
     * CONSTRUCTOR, sets title
     * @param title name of the record, in plaintext
     */
    public SecureTitle(String title){
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
