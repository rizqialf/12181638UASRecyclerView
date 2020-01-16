package com.example.a12181638uasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

    }

    private ArrayList<Model> getMyList() {
            ArrayList<Model> models = new ArrayList<>();
            Model m = new Model();
            m.setTitle("Kamera Action");
            m.setDescription("This is New Feed Description");
            m.setImg(R.drawable.action);
            models.add(m);

            m = new Model();
            m.setTitle("Kamera Boutique");
            m.setDescription("This is New Feed Description");
            m.setImg(R.drawable.boutique);
            models.add(m);

            m = new Model();
            m.setTitle("Kamera DSLR");
            m.setDescription("This is New Feed Description");
            m.setImg(R.drawable.dslr);
            models.add(m);

            m = new Model();
            m.setTitle("Kamera Medium Format");
            m.setDescription("This is New Feed Description");
            m.setImg(R.drawable.medium_format);
            models.add(m);

            m = new Model();
            m.setTitle("Kamera mirrorless");
            m.setDescription("This is New Feed Description");
            m.setImg(R.drawable.mirrorless);
            models.add(m);

            m = new Model();
            m.setTitle("Kamera Pocket");
            m.setDescription("This is New Feed Description");
            m.setImg(R.drawable.pocket);
            models.add(m);

            m = new Model();
            m.setTitle("Kamera Prosumer");
            m.setDescription("This is New Feed Description");
            m.setImg(R.drawable.prosumer);
            models.add(m);

            m = new Model();
            m.setTitle("Kamera Video");
            m.setDescription("This is New Feed Description");
            m.setImg(R.drawable.video);
            models.add(m);

            return models;

    }
}