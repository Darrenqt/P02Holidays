package com.example.a16022809.p02_holidays;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et = (EditText) findViewById(R.id.et);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holidays();
            }
        });

    }

    private void holidays() {
        Intent intent = new Intent(MainActivity.this, Holidays.class);
        startActivity(intent);
    }
}
