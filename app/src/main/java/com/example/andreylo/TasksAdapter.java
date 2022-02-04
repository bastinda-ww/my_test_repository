package com.example.andreylo;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class TasksAdapter {
    class TasksViewHolder extends RecyclerView.ViewHolder {

        TextView timeStartEvent;
        TextView nameOfEvent;

        public TasksViewHolder(View itemView) {
            super(itemView);
        }

    }
}
