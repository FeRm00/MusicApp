package com.kikisnight.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Find the RelativeLaout that shows the next category
        RelativeLayout n_playlist = (RelativeLayout)findViewById(R.id.n_playlist);
        RelativeLayout n_listArtist = (RelativeLayout)findViewById(R.id.n_list_artist);
        RelativeLayout n_searchScreen = (RelativeLayout)findViewById(R.id.n_search_screen);

        n_playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent n_playlistIntent = new Intent(NowPlayingActivity.this, PlaylistActivity.class);
                startActivity(n_playlistIntent);
            }
        });

        n_listArtist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent n_listArtistIntent = new Intent(NowPlayingActivity.this, ListArtistActivity.class);
                startActivity(n_listArtistIntent);
            }
        });

        n_searchScreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent n_searchScreenIntent = new Intent(NowPlayingActivity.this, SearchScreenActivity.class);
                startActivity(n_searchScreenIntent);
            }
        });
    }
}
