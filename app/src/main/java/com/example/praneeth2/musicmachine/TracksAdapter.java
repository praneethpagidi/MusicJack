package com.example.praneeth2.musicmachine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.praneeth2.musicmachine.com.example.praneeth2.musicmachine.soundcloud.Track;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by praneeth2 on 8/23/16.
 */
public class TracksAdapter extends RecyclerView.Adapter<TracksAdapter.ViewHolder> {


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private final TextView mTitleTextView;
        private final ImageView mThumbImageView;

        ViewHolder(View v){
            super(v);
            mTitleTextView = (TextView)v.findViewById(R.id.track_title);
            mThumbImageView = (ImageView)v.findViewById(R.id.track_thumbnail);
            v.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            if(mOnItemClickListener != null){
                mOnItemClickListener.onItemClick(null, view, getPosition(), 0);
            }

        }

    }


    private List<Track> mTracks;
    private Context mContext;
    private AdapterView.OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    TracksAdapter(Context context, List<Track> tracks){
        mTracks = tracks;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.track_row, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Track track = mTracks.get(i);
        viewHolder.mTitleTextView.setText(track.getTitle());
        Picasso.with(mContext).load(track.getAvatarURL()).into(viewHolder.mThumbImageView);
    }

    @Override
    public int getItemCount() {
        return mTracks.size();
    }


}
