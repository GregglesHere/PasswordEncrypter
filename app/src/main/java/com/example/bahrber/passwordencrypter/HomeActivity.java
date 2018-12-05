package com.example.bahrber.passwordencrypter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private static String variable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        TextView pass = (TextView) findViewById(R.id.PasswordInput);

        Spinner dropdown = findViewById(R.id.EncryptionOptions);
        String[] items = new String[]{"One", "Two", "Three", "Four"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        variable =  pass.getText().toString();
        Button button = (Button) findViewById(R.id.EncrpytButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView updated = (TextView) findViewById(R.id.NewPassword);
                updated.setText("Updated Password");

            }
        });
    }
}
