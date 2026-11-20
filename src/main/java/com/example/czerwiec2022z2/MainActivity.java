package com.example.czerwiec2022z2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String numerKurs;
    String imieNazwisko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText inputImieNazwisko = findViewById(R.id.editTextText);
        EditText inputKurs = findViewById(R.id.editTextText2);


        Button zapisz = findViewById(R.id.button);

        zapisz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imieNazwisko = inputImieNazwisko.getText().toString().trim();
                numerKurs = inputKurs.getText().toString().trim();

                if (numerKurs.equals("1")) {
                    Toast.makeText(MainActivity.this, imieNazwisko + " - Programowanie z C#", Toast.LENGTH_SHORT).show();
                } else if (numerKurs.equals("2")) {
                    Toast.makeText(MainActivity.this, imieNazwisko + " - Angular dla początkujących", Toast.LENGTH_SHORT).show();
                } else if (numerKurs.equals("3")) {
                    Toast.makeText(MainActivity.this, imieNazwisko + " - Kurs Django", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Nieprawidłowy numer kursu", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}