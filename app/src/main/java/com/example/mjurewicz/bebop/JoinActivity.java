package com.example.mjurewicz.bebop;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JoinActivity extends AppCompatActivity {
    Data d = Data.getData();
    Typeface tf;
    TextView tvAppName;
    EditText etUsername, etPassword, etEmail;
    Button bJoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        tf = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");

        tvAppName = (TextView) findViewById(R.id.tvAppName);
        tvAppName.setTypeface(tf);
        tvAppName.setPaintFlags(tvAppName.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etUsername.setTypeface(tf);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPassword.setTypeface(tf);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etEmail.setTypeface(tf);

        bJoin = (Button) findViewById(R.id.bJoin);
        bJoin.setTypeface(tf);
        bJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                d.setUsername(username);
                Toast.makeText(getApplicationContext(), "Welcome " + username, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(JoinActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_join, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
