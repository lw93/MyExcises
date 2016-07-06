package com.liuweizhg.udacityhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne= (Button) findViewById(R.id.but_one);
        btnTwo= (Button) findViewById(R.id.but_two);
        btnThree= (Button) findViewById(R.id.but_three);
        btnFour= (Button) findViewById(R.id.but_four);
        btnFive= (Button) findViewById(R.id.but_five);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"this will launch one app",Toast.LENGTH_SHORT).show();
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"this will launch two app",Toast.LENGTH_SHORT).show();
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"this will launch three app",Toast.LENGTH_SHORT).show();
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"this will launch four app",Toast.LENGTH_SHORT).show();
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"this will launch five app",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
