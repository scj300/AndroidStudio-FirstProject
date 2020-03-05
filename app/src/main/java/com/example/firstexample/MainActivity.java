package com.example.firstexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar tool = findViewById(R.id.toolbar);
        setSupportActionBar(tool);

        // List of consoles
        ArrayList<VideoConsole> consoleList = new ArrayList<VideoConsole>();

        // PS4 and Xbox X
        VideoConsole ps4 = new VideoConsole("Sonny", "Play Station 4", R.drawable.graduate);
        VideoConsole xbox = new VideoConsole("Microsoft", "Xbox One X", R.drawable.xbox);

        // Adding consoles to the consoleList
        consoleList.add(ps4);
        consoleList.add(xbox);

        // VideoConsoleAdapter
        VideoConsoleAdapter videoConsoleAdapter = new VideoConsoleAdapter(this, consoleList);
        ListView videoConsoleListView = findViewById(R.id.videoConsoleListView);
        videoConsoleListView.setAdapter(videoConsoleAdapter);

        videoConsoleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ImageView consoleImage = (ImageView) view.findViewById(R.id.consoleImage);

                RotateAnimation anim = new RotateAnimation(0f, 350f, 15f, 15f);
                anim.setInterpolator(new LinearInterpolator());
                anim.setRepeatCount(Animation.ZORDER_TOP);
                anim.setDuration(3000);

                consoleImage.startAnimation(anim);
                Log.d("Click item: ", String.valueOf(position));
            }
        });

    }

}
