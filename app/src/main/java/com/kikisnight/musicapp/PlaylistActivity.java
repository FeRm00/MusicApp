package com.kikisnight.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //Explanation of the purpose of this activity
        Toast toast = Toast.makeText(getApplicationContext(), getApplicationContext().getResources().getString(R.string.explain_Playlist), Toast.LENGTH_LONG);
        toast.show();
    }
}
