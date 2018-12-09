package com.example.bahrber.passwordencrypter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class HomeActivity extends AppCompatActivity  {
    private static String input;
    private int encryptionNumber;
    Encryption encrypter = new Encryption();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        TextView pass = (TextView) findViewById(R.id.PasswordInput);
        encryptionNumber = 0;
        Spinner dropdown = findViewById(R.id.EncryptionOptions);
        String[] items = new String[]{"One", "Two", "Three", "Four"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(new OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position,long id) {
                String item = parent.getItemAtPosition(position).toString();
                if (item == "One") {
                    encryptionNumber = 1;
                } else if (item == "Two") {
                    encryptionNumber = 2;
                } else if (item == "Three") {
                    encryptionNumber = 3;
                } if (item == "Four") {
                    encryptionNumber = 4;
                }
            }
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
        Button encrypt = (Button) findViewById(R.id.EncrpytButton);
        encrypt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView pass = (TextView) findViewById(R.id.PasswordInput);
                input =  pass.getText().toString();
                TextView updated = (TextView) findViewById(R.id.NewPassword);
                updated.setText(input);
                String encrypted = "";
                if (encryptionNumber == 1) {
                    encrypted = encrypter.basicPasswordEncryption(input);
                    updated.setText(encrypted);
                } else if (encryptionNumber == 2) {
                    encrypted = (encrypter.strongPasswordEncryption(input)).substring(0,input.length());
                } else if (encryptionNumber == 3) {
                    encrypted = "Coming Soon";
                }
                updated.setGravity(Gravity.CENTER);
                updated.setText(encrypted);

            }
        });
        Button storage = (Button) findViewById(R.id.storage);
        storage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, StorageActivity.class);
                startActivity(intent);

            }
        });
    }
}
