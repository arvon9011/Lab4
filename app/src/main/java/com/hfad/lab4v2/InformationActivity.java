package com.hfad.lab4v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class InformationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        getinfo();
    }



    private void getinfo(){

        String[] smaklosaAlbum = getResources().getStringArray(R.array.SmaklosaAlbums);

        String currentAlbum = getIntent().getStringExtra("AlbumID");

        TextView textView = (TextView) findViewById(R.id.textView);
        TextView header = (TextView) findViewById(R.id.header);

        if ( currentAlbum.equals(smaklosaAlbum[0]))
        {
            header.setText(smaklosaAlbum[0]);
            textView.setText(getString(R.string.moonboats));
        }

       else if ( currentAlbum.equals(smaklosaAlbum[1]))
       {
           header.setText(smaklosaAlbum[1]);
            textView.setText(getString(R.string.mordarsniglar));
        }

        else if ( currentAlbum.equals(smaklosaAlbum[2]))
        {
            header.setText(smaklosaAlbum[2]);
            textView.setText(getString(R.string.kor));
        }

        else if ( currentAlbum.equals(smaklosaAlbum[3]))
        {
            header.setText(smaklosaAlbum[3]);
            textView.setText(getString(R.string.desperado));
        }

        else if ( currentAlbum.equals(smaklosaAlbum[4]))
        {
            header.setText(smaklosaAlbum[4]);
            textView.setText(getString(R.string.repar));
        }

    }


}