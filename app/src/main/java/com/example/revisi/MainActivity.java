package com.example.revisi;

import android.os.Bundle;

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

        // Inisialisasi Komponen
        NamaBahan = findViewById(R.id.editTextText);
        HargaBeli = findViewById(R.id.editTextText2);
        spinnerItem = findViewById(R.id.spinner);
        btnTambah = findViewById(R.id.button3);
        btnHitung = findViewById(R.id.button2);

        // Event Klik Tambahkan
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaBahan = NamaBahan.getText().toString();
                String hargaBeli = HargaBeli.getText().toString();

                if (namaBahan.isEmpty() || hargaBeli.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Harap isi semua data!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Bahan Ditambahkan: " + namaBahan, Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Event Klik Mulai Hitung
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menghitung Harga Jual...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
