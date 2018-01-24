package com.example.android.miwok;

import android.content.Context;

/**
 * Created by shaynk on 1/20/18.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    public Word (String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getImageResourceId() { return mImageResourceId; }

    public void setMiwok(String text) {
        mMiwokTranslation = text;
    }
    public void setDefaultTranslation(String text) {
        mDefaultTranslation = text;
    }
    public void setImageResourceId(int id) { mImageResourceId = id; }

}
