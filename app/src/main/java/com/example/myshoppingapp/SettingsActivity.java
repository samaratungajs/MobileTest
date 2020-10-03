package com.example.myshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myshoppingapp.Prevalent.Prevalent;

public class SettingsActivity extends AppCompatActivity {

    private Button securityQuestionBtn;
    private TextView tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        securityQuestionBtn = findViewById(R.id.Security_questions_btn);

        securityQuestionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this,ResetPasswordActivity.class);
                intent.putExtra("check","settings");
                startActivity(intent);

                tts = findViewById(R.id.tt);
                tts.setText(Prevalent.currentOnlineUser.getUsername());
            }
        });

    }
}