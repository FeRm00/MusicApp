package com.kikisnight.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the RelativeLaout that shows the next category
        RelativeLayout nowPlaying = (RelativeLayout)findViewById(R.id.now_playing);
        RelativeLayout playlist = (RelativeLayout)findViewById(R.id.playlist);
        RelativeLayout listArtist = (RelativeLayout)findViewById(R.id.list_artist);
        RelativeLayout searchScreen = (RelativeLayout)findViewById(R.id.search_screen);


        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        listArtist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent listArtistIntent = new Intent(MainActivity.this, ListArtistActivity.class);
                startActivity(listArtistIntent);
            }
        });

        searchScreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent searchScreenIntent = new Intent(MainActivity.this, SearchScreenActivity.class);
                startActivity(searchScreenIntent);
            }
        });
    }
}
