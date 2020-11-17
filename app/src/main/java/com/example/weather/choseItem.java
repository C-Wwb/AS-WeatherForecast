package com.example.weather;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class choseItem extends AppCompatActivity implements View.OnClickListener {
    Button in_time;
    Button future;
    LinearLayout start;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chose_item);
        findButtons();
        in_time.setOnClickListener(this);
        future.setOnClickListener(this);
        //start.setBackgroundResource(R.drawable.back4);
    }


    public void findButtons(){
        in_time=findViewById(R.id.in_time);
        future=findViewById(R.id.future);
        start=findViewById(R.id.start);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.in_time:
                Intent intent1=new Intent(this,MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.future:
                Intent intent2=new Intent(this,FutureWeather.class);
                startActivity(intent2);
                break;
        }
    }
}
