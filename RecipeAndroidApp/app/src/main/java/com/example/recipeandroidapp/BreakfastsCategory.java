package com.example.recipeandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class BreakfastsCategory extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfasts_category); // Replace with the actual layout name
// Find views by their IDs
        ImageView imageBreakfast = findViewById(R.id.imageBreakfast);
        TextView textBreakfastName = findViewById(R.id.textBreakfastName);
        Button btnAddBreakfast = findViewById(R.id.btnAddBreakfast);
// Set click listener for the "Add" button
        btnAddBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BreakfastsCategory.this, RecipeDetails.class);
                startActivity(intent);
            }
        });
    }
}
