package com.example.tema2;

import static com.example.tema2.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Movie movie;
    private EditText editTitle;
    private Spinner spGen;
    private RatingBar rbMovie;
    private EditText release;
    private SeekBar sbBudget;
    private ImageView ivPoster;
    private Switch swSeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        String[] genuri = {"HORROR", "ACTION", "COMEDY", "ADVENTURE"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                genuri);
        Spinner spinner = findViewById(id.spinner);
        spinner.setAdapter(adapter);

        editTitle = findViewById(id.editTextTitlu);
        spGen = findViewById(id.spinner);
        rbMovie = findViewById(id.ratingBar);
        release = findViewById(id.editTextDate);
        sbBudget = findViewById(id.seekBuget);
        ivPoster = findViewById(id.imgPlus);
        swSeek = findViewById(id.swSeek);

//        EditText etTitlu = findViewById(id.editTextTitlu);
//        EditText etDate = findViewById(id.editTextDate);
//        RatingBar rtBar = findViewById(id.ratingBar);
//        SeekBar skBudget = findViewById(id.seekBuget);
//        ImageView pisica = findViewById(id.imgPisica);
//        Switch swSeek = findViewById(id.swSeek);
//
//        Button btnSave = findViewById(id.btnSave);
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(etTitlu.getText().toString().isEmpty())
//                    etTitlu.setError("Introduceti titlul!");
//                else
//                    if(etDate.getText().toString().isEmpty())
//                        etDate.setError("Introduceti data!");
//                    else{
//
//                    }
//            }
//        });
    }
}