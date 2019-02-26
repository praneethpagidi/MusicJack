package com.example.praneeth2.musicmachine.com.example.praneeth2.musicmachine.soundcloud;

import retrofit.RestAdapter;

/**
 * Created by praneeth2 on 8/23/16.
 */
public class SoundCloud {

    private static final String API_URL = "http://api.soundcloud.com";

    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder()
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .setEndpoint(API_URL)
            .build();

    private static final SoundCloudService SERVICE = REST_ADAPTER.create(SoundCloudService.class);

    public static SoundCloudService getService(){
        return SERVICE;
    }
}
