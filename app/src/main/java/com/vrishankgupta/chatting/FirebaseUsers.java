package com.vrishankgupta.chatting;

/**
 * Created by aryam on 2/13/2018.
 */

public class FirebaseUsers {
    private String id;
    private String displayName;
    private String photoURL;

    public FirebaseUsers(String id,String displayName,String photoURL) {
        this.displayName = displayName;
        this.photoURL = photoURL;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
