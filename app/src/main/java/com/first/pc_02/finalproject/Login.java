package com.first.pc_02.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText login_id = null;
    EditText login_pw = null;
    Button login = null;
    Button join = null;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_id = findViewById(R.id.login_id);
        login_pw = findViewById(R.id.login_pw);
        login = findViewById(R.id.login);
        join = findViewById(R.id.join);


        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_join = new Intent(Login.this,Join.class);
                startActivity(go_join);

            }
        });




    }
}
