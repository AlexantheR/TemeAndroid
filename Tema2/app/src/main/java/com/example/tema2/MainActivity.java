package com.example.tema2;

import static com.example.tema2.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final int PICK_IMAGE = 1;
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

        Button btnSave = findViewById(id.btnSave);
        btnSave.setOnClickListener(view -> {
            movie=new Movie();
            movie.setTitle(editTitle.getText().toString());
            movie.setGen(Genre.valueOf(spGen.getSelectedItem().toString()));
            movie.setRating((byte) rbMovie.getRating());
            movie.setRelease(release.getText().toString());
            movie.setBudget(sbBudget.getProgress());
            movie.setSeekable(swSeek.isChecked());
            Toast.makeText(MainActivity.this, "\n" +
                    "Title: " + movie.getTitle() + "\n" +
                    "Genre: " + movie.getGen() + "\n" +
                    "Rating: " + movie.getRating() + "\n" +
                    "Date: " + movie.getRelease() + "\n" +
                    "Budget: " + movie.getBudget() + " RON" + "\n" +
                    "Is seekable? : " + movie.getSeekable(), Toast.LENGTH_LONG).show();
        });


            ImageView btnPick = findViewById(id.imgPlus);
            btnPick.setOnClickListener(view -> {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);
            });

    }
}