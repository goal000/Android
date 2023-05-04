package com.example.textapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text;
    TextView view1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText)findViewById(R.id.editText);
        view1=(TextView)findViewById(R.id.textedit);
    }
    public void onClick(View view) {
        view1.setText("Hello!\n" + text.getText().toString());
    }
}