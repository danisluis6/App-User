package com.example.enclaveit.appuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText email,pass;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_login);
        initComponents();
    }

    private void initComponents() {
        email = (EditText)this.findViewById(R.id.email);
        pass = (EditText)this.findViewById(R.id.pass);
    }
}
