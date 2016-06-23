package com.example.kenyamamoto.gskadai02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by kenyamamoto on 2016/06/23.
 */
public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String address = intent.getStringExtra("address");
        String age = intent.getStringExtra("age");


        TextView edit_name = (TextView) findViewById(R.id.sub_name);
        TextView edit_address = (TextView) findViewById(R.id.sub_address);
        TextView edit_age = (TextView) findViewById(R.id.sub_age);
        edit_name.setText(name);
        edit_address.setText(address);




    }
}
