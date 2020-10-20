package com.example.activityandactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtname,txtemail,txtusername,txtpassword;
    Button btnmove;
    private static final int REQUEST_CODE_MOVE = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname = findViewById(R.id.txtname);
        txtemail = findViewById(R.id.txtemail);
        txtusername = findViewById(R.id.txtusername);
        txtpassword = findViewById(R.id.txtpassword);
        findViewById(R.id.btnmove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,secondactivity.class);
                startActivityForResult(intent,REQUEST_CODE_MOVE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_MOVE && resultCode == RESULT_OK){
            String name = data.getStringExtra(secondactivity.Request_Name);
            String email = data.getStringExtra(secondactivity.Request_Email);
            String username = data.getStringExtra(secondactivity.Request_Username);
            String password = data.getStringExtra(secondactivity.Request_Password);

            txtname.setText(name);
            txtemail.setText(email);
            txtusername.setText(username);
            txtpassword.setText(password);
        }
    }
}