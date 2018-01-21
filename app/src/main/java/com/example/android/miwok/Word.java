package com.example.android.miwok;

import android.content.Context;

/**
 * Created by shaynk on 1/20/18.
 */

public class Word {

    private String miwok;
    private String defaultTranslation;


    public Word (Context context) {
        miwok = "";
        defaultTranslation = "";
    }

    public String getMiwokTranslation() {
        return miwok;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setMiwok(String text) {
        miwok = text;
    }

    public void setDefaultTranslation(String text) {
        defaultTranslation = text;
    }
}
