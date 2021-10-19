package com.example.sportorederence;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    TextView lblName, lblSport;
    @Override
    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_display);
        lblName = (TextView) findViewById(R.id.lblName);
        lblSport = (TextView) findViewById(R.id.lblSport);
        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("name");
        String sport = bundle.getString("sport");

        lblName.setText(lblName.getText() + " " + name);
        lblSport.setText(lblSport.getText() + " " + name);



    }
    public void toReturn(View view) {

        Intent in = new Intent(DisplayActivity.this, MainActivity.class);

        startActivity(in);
    }




}
