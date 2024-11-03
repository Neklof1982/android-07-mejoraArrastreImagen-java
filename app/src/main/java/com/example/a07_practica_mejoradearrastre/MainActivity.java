package com.example.a07_practica_mejoradearrastre;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

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

        View objeto1 = findViewById(R.id.imageView);
        View objeto2 = findViewById(R.id.imageView2);


        objeto1.setOnTouchListener(new View.OnTouchListener() {



            @Override
            public boolean onTouch(View view, MotionEvent event) {

                int top = (int) event.getRawX();
                int left = (int) event.getRawX();
                int width = left + objeto1.getWidth();
                int height = top + objeto1.getHeight();

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:



                        return true;
                }
                return false;
            }
        });{

        }


    }
}