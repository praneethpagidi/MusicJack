package com.example.praneeth2.musicmachine.com.example.praneeth2.musicmachine.soundcloud;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;


/**
 * Created by praneeth2 on 8/23/16.
 */
public interface SoundCloudService {

    String PATH_TRACKS = "/tracks";
    String QUERY_PARAM_CLIENT_ID = "?client_id=";

    String CLIENT_ID = "1af249f9a50e6ad21f5fd94a9c7be1bc";

    @GET(PATH_TRACKS + QUERY_PARAM_CLIENT_ID + CLIENT_ID)
    void searchSongs(@Query("q") String query, Callback<List<Track>> cb);

    @GET(PATH_TRACKS + QUERY_PARAM_CLIENT_ID + CLIENT_ID)
    void getRecentSongs(@Query("created_at[from]") String date, Callback<List<Track>> cb);
}
