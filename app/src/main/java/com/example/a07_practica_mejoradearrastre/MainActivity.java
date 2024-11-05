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

    private float x;
    private float y;


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


                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        // Guardar la posición de pulsar
                        x = event.getRawX() - view.getX();
                        y = event.getRawY() - view.getY();
                        break;

                    case MotionEvent.ACTION_MOVE:
                        // Cambiar la posición segun el movimiento
                        float newX = event.getRawX() - x;
                        float newY = event.getRawY() - y;

                        // Animate the view to new position smoothly
                        view.animate()
                                .x(newX)
                                .y(newY)
                                .setDuration(0) // Set duration for no animation delay (instant move)
                                .start();
                        break;

                    case MotionEvent.ACTION_UP:
                        // Optionally handle touch release (e.g., for snapping or actions)
                        break;

                    default:
                        return false;
                }
                return true;
            }
        });
    }
}
