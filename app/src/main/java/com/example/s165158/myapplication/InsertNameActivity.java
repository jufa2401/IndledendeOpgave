package com.example.s165158.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by s165158 on 18-09-2017.
 */

public class InsertNameActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b2;
    private EditText t;
    private TextView response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        t = (EditText) findViewById(R.id.editText);
        response = (TextView) findViewById(R.id.hej);
        b2 = (Button) findViewById(R.id.Meme);

        b2.setOnClickListener(this);


    }

    // Implement the OnClickListener callback
    public void onClick(View v) {
        response.setText(t.getText());
       System.out.println("Et navn blev indtastet og der blev trykket Ok");
    }
}