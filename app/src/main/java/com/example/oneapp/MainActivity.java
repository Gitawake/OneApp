package com.example.oneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.oneApp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText userId = findViewById(R.id.editTextTextPersonName);
        String userId_value = userId.getText().toString();
        EditText password = findViewById(R.id.editTextTextPassword2);
        String password_value = password.getText().toString();
        Context context = getApplicationContext();
        if (userId_value.isEmpty()) {
            CharSequence text = "请输入用户名!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return;
        }

        if (password_value.isEmpty()) {
            CharSequence text = "请输入用户密码!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return;
        }
        CharSequence text = "发送成功!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        intent.putExtra(EXTRA_MESSAGE, userId_value);
        startActivity(intent);
    }
}