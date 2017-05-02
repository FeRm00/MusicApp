package com.kikisnight.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ListArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_artist);

        //Explanation of the purpose of this activity
        Toast toast = Toast.makeText(getApplicationContext(), getApplicationContext().getResources().getString(R.string.explain_List_Artist), Toast.LENGTH_LONG);
        toast.show();
    }
}
