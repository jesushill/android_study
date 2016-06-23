package com.example.kenyamamoto.gskadai02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String email_pattern = ".*@.*";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClickButton(View view){
        EditText editNameView = (EditText) findViewById(R.id.edit_name);
        EditText ediAddressView = (EditText) findViewById(R.id.edit_address);
        EditText editAgeView = (EditText) findViewById(R.id.edit_age);

//        値を取得
        String editName = editNameView.getText().toString();
        String editAddress = ediAddressView.getText().toString();
        String editAge = editAgeView.getText().toString();

        if (!editAddress.equals("") && !editAddress.equals("") && !editAge.equals("")){
            Intent intent = new Intent(this,SubActivity.class);

            intent.putExtra("name",editName);
            intent.putExtra("address",editAddress);
            intent.putExtra("age",editAge);
            startActivity(intent);
        } else if(editAddress.matches(email_pattern)) {
            Toast.makeText(this,"@が抜けています。アドレスを入力して下さい",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,"入力エラー",Toast.LENGTH_LONG).show();
        }

    }

}
