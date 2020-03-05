package com.example.firstexample;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class VideoConsoleRecycledAdadpter extends RecyclerView.Adapter<VideoConsoleRecycledAdadpter.MyViewHolder> {

    protected VideoConsole[] consoleData;

    public VideoConsoleRecycledAdadpter(VideoConsole[] consolesData) {
        this.consoleData = consolesData;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public static LinearLayout linearLayout;

        public MyViewHolder(LinearLayout v) {
            super(v);
            linearLayout = v;
        }
    }

    public VideoConsoleRecycledAdadpter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.videoconsole_item, parent, false);
        MyViewHolder vH = new MyViewHolder(linearLayout);

        return vH;
    }


    public void onBindViewHolder(MyViewHolder holder, int position) {
        ((TextView)holder.linearLayout.findViewById(R.id.videoConsoleName)).setText(consoleData[position].getConsoleName());
        ((TextView)holder.linearLayout.findViewById(R.id.videoConsoleCompany)).setText(consoleData[position].getCompany());
    }

    public int getItemCount() {
        return this.consoleData.length;
    }

}
