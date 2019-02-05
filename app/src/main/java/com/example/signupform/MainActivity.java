package com.example.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button save = findViewById(R.id.button);
        final EditText email = findViewById(R.id.Email);
        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.pwd);
        final EditText confirmation = findViewById(R.id.pwdconfirm);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strEmail = email.getText().toString();
                String strUsername = username.getText().toString();
                String strPassword = password.getText().toString();
                String strConfirmation = confirmation.getText().toString();
                if (TextUtils.isEmpty(strEmail) || TextUtils.isEmpty(strUsername) || TextUtils.isEmpty(strPassword) || TextUtils.isEmpty(strConfirmation)) {
                    Toast.makeText(MainActivity.this, "Please enter all information", Toast.LENGTH_SHORT).show();
                }
                else if (!strPassword.equals(strConfirmation)){
                    Toast.makeText(MainActivity.this, "Password do not match", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Welcome, " + strUsername + ", to the SignUpForm App", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
