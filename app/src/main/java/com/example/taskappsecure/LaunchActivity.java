package com.example.taskappsecure;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.taskappsecure.ui.login.LoginActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {


    public static final String TOKEN_KEY = "A";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPref =
                getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        //Log.d("VALOR PRE", sharedPref);
        String defaultValue = getResources().getString(R.string.preference_file_key_not);
        String valToken = sharedPref.getString(getString(R.string.preference_file_key), defaultValue);
        if (valToken.contains(TOKEN_KEY)) {
            //TODO go to MainActivity
            Intent intentMain = new Intent(this, MainActivity.class);
            startActivity(intentMain);
        } else {
            //TODO go to LoginActivity
            Intent intentLogin = new Intent(this, LoginActivity.class);
            startActivity(intentLogin);
        }
    }

}





