package com.starkvilletech.chris.mycontacts;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ChrisEady on 8/5/15.
 */
public class Contact implements Serializable{
    private String mName;
    public ArrayList<String> phoneNumbers;
    public ArrayList<String> emails;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}
