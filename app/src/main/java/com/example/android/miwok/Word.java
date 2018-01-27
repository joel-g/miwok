package com.example.android.miwok;

import android.content.Context;

/**
 * Created by shaynk on 1/20/18.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word (String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceID;
    }

    public Word (String defaultTranslation, String miwokTranslation, int audioResourceID, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceID;
        mImageResourceId = imageResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getAudioResourceId() { return mAudioResourceId; }
    public int getImageResourceId() { return mImageResourceId; }

    public void setMiwok(String text) {
        mMiwokTranslation = text;
    }
    public void setDefaultTranslation(String text) {
        mDefaultTranslation = text;
    }
    public void setImageResourceId(int id) { mImageResourceId = id; }

}
