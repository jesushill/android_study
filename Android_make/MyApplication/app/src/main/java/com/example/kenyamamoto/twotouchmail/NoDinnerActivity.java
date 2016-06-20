package com.example.kenyamamoto.twotouchmail;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kenyamamoto on 2016/06/20.
 */
public class NoDinnerActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_dinner);
        Button btnSend = (Button) this.findViewById(R.id.button);
        Button btnSend = (Button) this.findViewById(R.id.button);
        btnSend.setOnClickListener(this);
        btnSend.setOnLongClickListener(this);
    }
    @Override
    public void onClick(View v){
        EditText edit01 = (EditText)findViewById(R.id.editText);
        String title = edit01.getText().toString();
        Resources res = getResources();
        Uri uri = Uri.parse("mailto" + "em072029@gmail.com".toString());
        Intent intent = new Intent(Intent.Action_SENDTO,uri);
        intent.putExtra(Intent.EXTRA_SUBJECT,title);
        intent.putExtra(Intent.EXTRA_TEXT,"遅くなるのでめしいらない");
        startActivity(intent);
    }
    @Override
    public boolean onLongClick(View v){
        EditText edit01 = (EditText)findViewById(R.id.editText);
        String title = edit01.getText().toString();
        Resources res = getResources();
        Uri uri = Uri.parse("mailto" + "em072029@gmail.com".toString());
        Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
        intent.putExtra(Intent.EXTRA_SUBJECT,title);
        
    }

}
