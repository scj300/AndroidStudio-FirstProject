package com.example.firstexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class VideoConsoleAdapter extends ArrayAdapter<VideoConsole> {


    public VideoConsoleAdapter(Context context, ArrayList<VideoConsole> videoConsoles) {
        super(context, 0, videoConsoles);

    } // end Constructor()

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        VideoConsole console = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.videoconsole_item, parent, false);
        }

        TextView consoleCompany = convertView.findViewById(R.id.videoConsoleCompany);
        TextView consoleName = convertView.findViewById(R.id.videoConsoleName);

        consoleCompany.setText(console.getCompany());
        consoleName.setText(console.getConsoleName());

        return convertView;
    } // end getView(...)

} // end VideoConsoleAdapter()
