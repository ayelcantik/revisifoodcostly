package com.example.revisi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button addCount = findViewById(R.id.addCount);
        Button resepku = findViewById(R.id.resepKu);
        TextView profile = findViewById(R.id.profile);
        TextView histori = findViewById(R.id.histori);
        TextView avatarProfile = findViewById(R.id.avatarProfile);

        addCount.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ??);
//                startActivity(intent);
            }
        });

        histori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHistori = new Intent(MainActivity.this, HistoriActivity.class);
                startActivity(toHistori);
            }
        });

         resepku.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent toResep = new Intent(MainActivity.this, ListResepActivity.class);
                 startActivity(toResep);
             }
         });

         profile.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent toProfile = new Intent(MainActivity.this, ProfileActivity.class);
                 startActivity(toProfile);
             }
         });

         avatarProfile.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent toProfile = new Intent(MainActivity.this, ProfileActivity.class);
                 startActivity(toProfile);
             }
         });
    }
}