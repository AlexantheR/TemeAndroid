package com.example.tema1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView pisica=findViewById(R.id.pisica);
        pisica.setOnClickListener(view -> {
//                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
//                startActivity(intent);
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("image/*");
            String title = getResources().getString(R.string.chooser_title);
            Intent chooser = Intent.createChooser(intent,title);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(chooser);
            }
        });

        ImageView caine=findViewById(R.id.caine);
        caine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
//                startActivity(intent);

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/*");
                String title = getResources().getString(R.string.chooser_title);
                Intent chooser = Intent.createChooser(intent,title);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(chooser);
                }
            }
        });
    }
}