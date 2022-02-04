package com.example.andreylo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Calendar calendar = Calendar.getInstance();
    private RecyclerView tasksList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasksList = findViewById(R.id.recycleViewTimeTable);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        tasksList.setLayoutManager(layoutManager);
        tasksList.setHasFixedSize(true);




    }

}