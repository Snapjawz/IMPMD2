package com.example.konin.impmd2;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.konin.impmd2.Models.Vakken;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView age = findViewById(R.id.person_age);
        TextView name = findViewById(R.id.person_name);
        ImageView img = findViewById(R.id.person_photo);

        age.setText("TwentyOne");
        name.setText("Brent");
        img.setImageResource(R.drawable.test);

        RecyclerView rv = findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rv.setLayoutManager(llm);



    }
}
