package com.example.s165158.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button b, b2;
    private EditText t;
    private TextView response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.Dank);
        b.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.Meme);
        b2.setOnClickListener(this);


        t = (EditText) findViewById(R.id.editText);
        response = (TextView) findViewById(R.id.hej);



    }
    // Implement the OnClickListener callback
    public void onClick(View v) {
        // do something when the button is clicked
        switch (v.getId()) {
            case R.id.Dank:
                b.setText("hej");
                break;

            case R.id.Meme:
                String nameinserted = "Navnet: " + t.getText() + " blev indtastet";
                response.setText(nameinserted);
                System.out.println("Et navn blev indtastet og der blev trykket Ok");
                break;

            case R.id.settings:
                Context context = getApplicationContext();
                CharSequence text = "Endnu ikke implementeret";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


                Toast.makeText(getApplicationContext(), "hej", Toast.LENGTH_SHORT).show();


        }



    }




}