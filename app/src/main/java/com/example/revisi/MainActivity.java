package com.example.revisi;

import android.os.Bundle;
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

        addCount.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, ??);
//            startActivity(intent);
        });

        resepku.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, ??);
//            startActivity(intent);
        });


        profile.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, ??);
//            startActivity(intent);
        });

        avatarProfile.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, ??);
//            startActivity(intent);
        });

        histori.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, ??);
//            startActivity(intent);
        });
    }
}