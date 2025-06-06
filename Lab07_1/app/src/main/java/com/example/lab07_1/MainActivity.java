package com.example.lab07_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOpenChildActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenChildActivity = findViewById(R.id.button);
        btnOpenChildActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, child_activity.class);
            startActivity(intent);
        });
    }

    private class child_activity {
    }
}