package com.example.recipeandroidapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DessertsCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desserts_category); // Replace with the actual layout name

        // Find views by their IDs
        ImageView imageDessert = findViewById(R.id.imageDessert);
        TextView textDessertName = findViewById(R.id.textDessertName);
        Button btnAddDessert = findViewById(R.id.btnAddDessert);

        // Set click listener for the "Add" button
        btnAddDessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DessertsCategory.this, RecipeDetails.class);
                startActivity(intent);
            }
        });
    }
}