package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        String [] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        for (int i = 0; i < numbers.length; i++) {
            Log.v("NumbersActivity", numbers[i]);
        }
    }
}
