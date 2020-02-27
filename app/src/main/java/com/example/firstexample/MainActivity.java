package com.example.firstexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public Switch my_switch;
   // private int[] CELDAS;
   // private int[] CELDAS_CLICKED;
   // public int contador = 0;

    protected boolean endGame = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // List of consoles
        ArrayList<VideoConsole> consoleList = new ArrayList<VideoConsole>();

        // PS4 and Xbox X
        VideoConsole ps4 = new VideoConsole("Sonny", "Play Station 4");
        VideoConsole xbox = new VideoConsole("Microsoft", "Xbox One X");

        // Adding consoles to the consoleList
        consoleList.add(ps4);
        consoleList.add(xbox);

        // VideoConsoleAdapter
        VideoConsoleAdapter videoConsoleAdapter = new VideoConsoleAdapter(this, consoleList);
        ListView videoConsoleListView = findViewById(R.id.videoConsoleListView);
        videoConsoleListView.setAdapter(videoConsoleAdapter);

    }

}
