package com.starkvilletech.chris.mycontacts;

import java.util.ArrayList;

/**
 * Created by ChrisEady on 8/7/15.
 */
public class ContactList extends ArrayList<Contact> {
    private static ContactList sInstance = null;

    private  ContactList(){};

    public static ContactList getsInstance() {

        if(sInstance == null) {
            sInstance = new ContactList();
        }

        return sInstance;
    }
}
