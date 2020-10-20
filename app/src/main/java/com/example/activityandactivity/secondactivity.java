package com.example.activityandactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class secondactivity extends AppCompatActivity {

    EditText edtname,edtemail,edtusername,edtpassword;

    public static final String Request_Name = "REQUEST_NAME";
    public static final String Request_Email = "REQUEST_EMAIL";
    public static final String Request_Username = "REQUEST_USERNAME";
    public static final String Request_Password = "REQUEST_PASSWORD";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        edtname = findViewById(R.id.edtname);
        edtemail = findViewById(R.id.edtemail);
        edtusername = findViewById(R.id.edtusername);
        edtpassword = findViewById(R.id.edtpassword);
        findViewById(R.id.btndone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();
                data.putExtra(Request_Name,edtname.getText().toString());
                data.putExtra(Request_Email,edtemail.getText().toString());
                data.putExtra(Request_Username,edtusername.getText().toString());
                data.putExtra(Request_Password,edtpassword.getText().toString());
                setResult(RESULT_OK,data);
                finish();
            }
        });
    }
}