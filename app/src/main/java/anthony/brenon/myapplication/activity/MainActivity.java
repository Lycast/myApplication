package anthony.brenon.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import anthony.brenon.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private static final String USERNAME = "admin@admin.com";
    private static final String PASSWORD = "admin";
    private EditText etPassword;
    private EditText etUsername;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.activity_main_username);
        etPassword = findViewById(R.id.activity_main_password);
        mButton = findViewById(R.id.btn_activity_main_start);

        mButton.setOnClickListener(v -> login());
    }

    private void login() {
        boolean ok = etUsername.getText().toString().equals(USERNAME) && etPassword.getText().toString().equals(PASSWORD);
        if (ok) {
            Intent activity_home = new Intent(getBaseContext(), HomeActivity.class);
            startActivity(activity_home);
        } else {
            Toast.makeText(this, "invalid password or username", Toast.LENGTH_LONG).show();
        }
    }
}