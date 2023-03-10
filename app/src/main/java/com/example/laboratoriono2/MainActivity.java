package com.example.laboratoriono2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animal_ca1(View view){
        ImageView  miImageAnim = findViewById(R.id.imageView);
        TextView nameAnimal = findViewById(R.id.txtNombre);
        TextView articulo = findViewById(R.id.txtDescripcion);

         miImageAnim.setBackground((getResources().getDrawable(R.drawable.leon)));
        nameAnimal.setText(R.string.animal1);
        articulo.setText(R.string.desc_animal1);
    }

    public void animal_ca2(View view){
        ImageView miImagen = findViewById(R.id.imageView);
        TextView nameAnimal = findViewById(R.id.txtNombre);
        TextView articulo = findViewById(R.id.txtDescripcion);

        miImagen.setBackground((getResources().getDrawable(R.drawable.lobo)));
        nameAnimal.setText(R.string.animal2);
        articulo.setText(R.string.desc_animal2);
    }
}