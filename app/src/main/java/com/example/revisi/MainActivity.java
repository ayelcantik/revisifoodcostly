package com.example.revisi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText NamaBahan, HargaBeli;
    Spinner spinnerItem;
    Button btnTambah, btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Event Klik Mulai Hitung
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menghitung Harga Jual...", Toast.LENGTH_SHORT).show();
            }
        });
        Button addCount = findViewById(R.id.addCount);
        Button resepku = findViewById(R.id.resepKu);
        TextView profile = findViewById(R.id.profile);
        TextView histori = findViewById(R.id.histori);
        TextView avatarProfile = findViewById(R.id.avatarProfile);

        addCount.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
            Intent toCount = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(toCount);
//                Intent intent = new Intent(MainActivity.this, ??);
//                startActivity(intent);
            }
        });

        histori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent toHistori = new Intent(MainActivity.this, HistoriActivity.class);
//                startActivity(toHistori);
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
//                 Intent toProfile = new Intent(MainActivity.this, ProfileActivity.class);
//                 startActivity(toProfile);
             }
         });

         avatarProfile.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
//                 Intent toProfile = new Intent(MainActivity.this, ProfileActivity.class);
//                 startActivity(toProfile);
             }
         });
    }
}
