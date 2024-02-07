package com.example.normal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView RecyclerView = findViewById(R.id.mlistView);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.setLayoutManager(layoutManager);




        ArrayList<Person> peopleList = new ArrayList<>();

        for(int i = 0 ; i < 50 ; i++ ){


            peopleList.add(new Person( "Moussa TIGUI", "2000", "Male"));


        }




        RecyclerViewAdapter adapter = new RecyclerViewAdapter(  peopleList);

        RecyclerView.setAdapter(adapter);


    }
}