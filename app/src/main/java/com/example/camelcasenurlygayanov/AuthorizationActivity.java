package com.example.camelcasenurlygayanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Edits;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AuthorizationActivity extends AppCompatActivity {
    EditText log ;
    EditText pass ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

    }

    public void signin(View view) {
        log = (EditText) findViewById(R.id.editTextTextPersonName);
        pass = (EditText) findViewById(R.id.editTextTextPersonName2);

        final String login = log.getText().toString();
        final String password = pass.getText().toString();

        if (password.equals("admin") && login.equals("admin")) {
            Intent intent = new Intent(AuthorizationActivity.this, MenuActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Логин или пароль введены не верно.", Toast.LENGTH_LONG).show();
        }
    }

    public void registration(View view) {
        Intent intent = new Intent(AuthorizationActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }
}