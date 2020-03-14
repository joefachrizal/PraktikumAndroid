package com.android.cnd.praktikumandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnBiodata;
    Button btnBalok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBiodata = findViewById(R.id.btn_biodata);
        btnBalok = findViewById(R.id.btn_balok);

        btnBiodata.setOnClickListener(this);
        btnBalok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_biodata:
                Toast.makeText(this, "tombol biodata", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_balok:
                Toast.makeText(this, "tombol balok", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
