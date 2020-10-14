package com.example.camelcasenurlygayanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {
    EditText log ;
    EditText pass ;
    EditText mail;
    EditText repPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void BackAuthorizations(View view) {
        Intent intent = new Intent(RegistrationActivity.this, AuthorizationActivity.class );
        startActivity(intent);
    }

    public void registrations(View view) {
        log = (EditText) findViewById(R.id.reg_login);
        pass = (EditText) findViewById(R.id.reg_password);
        repPass = (EditText) findViewById(R.id. reg_rep_password);
        mail = (EditText) findViewById(R.id.reg_email);

        final String login = log.getText().toString();
        final String password = pass.getText().toString();
        final String repeat = repPass.getText().toString();
        final String email = mail.getText().toString();
        if (password.equals(toString()) == repPass.equals(toString()))
        {
            Intent intent = new Intent(RegistrationActivity.this, MenuActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Пароли не совпадают.", Toast.LENGTH_LONG).show();
        }
    }
}