package com.example.buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText userName;
    private EditText password;
    private Button login;
    private TextView errror;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.user_name);
        password = findViewById(R.id.password);
        login = findViewById(R.id.btn_login);
        errror = findViewById(R.id.tv_error);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                xulyDangnhap();
            }
        });
    }

    private void xulyDangnhap() {
        String username = userName.getText().toString();
        String pass = password.getText().toString();

        if (username.equals("admin") && pass.equals("123")){
            Toast.makeText(this, "dang nhap thanh cong", Toast.LENGTH_SHORT).show();
            errror.setVisibility(View.GONE);
        }else {
            errror.setVisibility(View.VISIBLE);
            errror.setText(" ten tai khoan hgoac mat khau sai");
            //thinhvh
            //thinhvh commit 2
        }
    }
}