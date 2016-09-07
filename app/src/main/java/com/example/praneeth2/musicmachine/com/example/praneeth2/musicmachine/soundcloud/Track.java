package com.example.praneeth2.musicmachine.com.example.praneeth2.musicmachine.soundcloud;

import com.google.gson.annotations.SerializedName;

/**
 * Created by praneeth2 on 8/22/16.
 */
public class Track {

    @SerializedName("title")
    private String mTitle;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("id")
    private int mID;

    @SerializedName("artwork_url")
    private String mArtworkURL;

    public String getArtworkURL() {
        return mArtworkURL;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getStreamURL() {
        return mStreamURL;
    }

    public void setStreamURL(String streamURL) {
        mStreamURL = streamURL;
    }

    public int getID() {
        return mID;
    }

    public void setID(int ID) {
        mID = ID;
    }

    public String getAvatarURL(){
        String avatarURL = mArtworkURL;
        if(avatarURL != null){
            avatarURL.replace("large", "tiny");
        }
        return avatarURL;
    }


}

