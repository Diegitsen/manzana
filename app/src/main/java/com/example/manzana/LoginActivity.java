package com.example.manzana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToActivity (View v) //arranca la segunda activity
    {
        Intent nuevoL = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(nuevoL);
    }
}
