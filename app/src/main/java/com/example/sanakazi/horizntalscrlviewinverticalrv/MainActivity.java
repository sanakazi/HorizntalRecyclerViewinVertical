package com.example.sanakazi.horizntalscrlviewinverticalrv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList = new ArrayList<>();
    RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    RecyclerViewDataAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList.add("A");  arrayList.add("B");  arrayList.add("C");  arrayList.add("D");  arrayList.add("E");
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
      /*  mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        myAdapter = new MyAdapter(this,arrayList);
        recyclerView.setAdapter(myAdapter);*/


        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        myAdapter = new RecyclerViewDataAdapter(this, arrayList);
        recyclerView.setAdapter(myAdapter);

    }
}
