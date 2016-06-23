package com.example.kenyamamoto.testview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        myTextView.setText("こんにちはーー");

//        button1
        Button myButton1 = (Button) findViewById(R.id.button);
        myButton1.setOnClickListener(new Button1ClickListener());
//        button2
        Button myButton2 = (Button) findViewById(R.id.button2);
        myButton2.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View v){
              Toast.makeText(MainActivity.this,"button2クリック",Toast.LENGTH_SHORT).show();

          }
        });
    }

    private class Button1ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"クリック",Toast.LENGTH_LONG).show();
        }
    }

    public void onButton3Click(View v){
        Toast.makeText(this,"Mybutton3クリック",Toast.LENGTH_SHORT).show();
    }
}

