package com.example.recipeandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MealsCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meals_category); // Replace with the actual layout name

        // Find views by their IDs
        ImageView imageMeals = findViewById(R.id.imageMeals);
        TextView textMealsName = findViewById(R.id.textMealsName);
        Button btnAddMeals = findViewById(R.id.btnAddMeals);

        // Set click listener for the "Add" button
        btnAddMeals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MealsCategory.this, RecipeDetails.class);
                startActivity(intent);
            }
        });
    }
}