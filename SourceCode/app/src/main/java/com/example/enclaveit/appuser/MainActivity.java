package com.example.enclaveit.appuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.enclaveit.appuser.utils.Font;

public class MainActivity extends AppCompatActivity {

    private EditText email,pass;
    private Button login;
    private TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_login);
        initComponents();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginAccount();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * @description: We create call SignUpActivity.java and receive resulf of return from
                 * Class SignUpActivity by StartActivityForResult().
                 * @Task2:
                 */
            }
        });
    }

    private void loginAccount() {

        if (!onLoginValidate()){
            onLoginFail();
        }
    }

    private void onLoginFail() {
        Toast.makeText(MainActivity.this,"Login successfully!",Toast.LENGTH_LONG).show();
        login.setEnabled(true);
    }

    private boolean onLoginValidate() {
        boolean valid = true;
        String txtEmail = String.valueOf(email.getText());
        String txtPassword = String.valueOf(pass.getText());
        if(txtEmail.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(txtEmail).matches()) {
            valid = false;
        }
        return valid;
    }

    private void initComponents() {
        email = (EditText)this.findViewById(R.id.email);
        email.setTypeface(new Font(MainActivity.this).setFont("Roboto-Medium"));

        pass = (EditText)this.findViewById(R.id.pass);
        pass.setTypeface(new Font(MainActivity.this).setFont("Roboto-Medium"));

        login = (Button)this.findViewById(R.id.login);
        login.setTypeface(new Font(MainActivity.this).setFont("Roboto-Black"));

        signup = (TextView)this.findViewById(R.id.signup);
        signup.setTypeface(new Font(MainActivity.this).setFont("Roboto-Light"));
    }
}
