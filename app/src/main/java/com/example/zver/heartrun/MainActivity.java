package com.example.zver.heartrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import android.media.MediaPlayer;
import android.util.Log;
import android.media.MediaMetadataRetriever;


public class MainActivity extends AppCompatActivity {

    protected int heartRate = 80;
    protected MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hr;
        hr = (TextView)findViewById(R.id.textView);

        hr.setText("" + heartRate);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);
    }

    public void toggleMusic(View v) {
        mediaPlayer.start();
        MediaMetadataRetriever metaRetriever = new MediaMetadataRetriever();

//        URI
//        Log.w("Heartrun", fileURL.getPath());

//        metaRetriever.setDataSource(fileURL.getPath());
//        String artist =  metaRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_ARTIST);
//        String title = metaRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_TITLE);
//
//        TextView st;
//        st = (TextView)findViewById(R.id.song_title);
//        st.setText(title);
    }

    public void rateUp(View v) {
        TextView hr;
        hr = (TextView)findViewById(R.id.textView);

        heartRate++;
        hr.setText("" + heartRate);
    }

    public void rateDown(View v) {
        TextView hr;
        hr = (TextView)findViewById(R.id.textView);

        heartRate--;
        hr.setText("" + heartRate);
    }

}
