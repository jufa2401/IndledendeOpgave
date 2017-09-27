package com.example.s165158.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.Dank);
        b.setOnClickListener(this);

    }
    // Implement the OnClickListener callback
    public void onClick(View v) {
        // do something when the button is clicked
        b.setText("hej");
    }




}