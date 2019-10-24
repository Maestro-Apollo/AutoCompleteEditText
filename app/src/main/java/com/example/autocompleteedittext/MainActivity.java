package com.example.autocompleteedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextView;
    private TextView textView;
    private static final String[] COUNTRIES = {"Bangladesh","India","Japan","Korea","Canada","Colombia","USA","UK"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.actv);
        textView = findViewById(R.id.textView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,COUNTRIES);
        autoCompleteTextView.setAdapter(adapter);

        String text = autoCompleteTextView.getText().toString().trim();
        textView.setText(text);
    }
}
