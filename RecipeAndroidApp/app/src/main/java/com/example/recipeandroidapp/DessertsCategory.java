package com.example.recipeandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DessertsCategory extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DessertAdapter adapter;
    private List<Dessert> dessertList;
    private List<Dessert> selectedList; // Change the type to Dessert

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desserts_category);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewDesserts);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize dessertList
        dessertList = new ArrayList<>();
        selectedList = new ArrayList<>();

        // Add sample dessert items
        dessertList.add(new Dessert(R.drawable.milk, "Milk"));
        dessertList.add(new Dessert(R.drawable.sugar, "Sugar"));

        // Initialize adapter
        adapter = new DessertAdapter(dessertList, this, new DessertAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Dessert selectedDessert = dessertList.get(position);
                selectedList.add(selectedDessert);
            }
        });

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);

        // Find the submit button
        Button submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start the CartActivity
                Intent intent = new Intent(DessertsCategory.this, Cart.class);
                // Put the selectedList as an extra
                intent.putExtra("selectedList", (Serializable) selectedList);
                // Start the CartActivity
                startActivity(intent);
            }
        });
    }
}