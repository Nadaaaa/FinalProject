package com.example.jokesandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_joke, new JokeFragment())
                .commit();
    }
}
