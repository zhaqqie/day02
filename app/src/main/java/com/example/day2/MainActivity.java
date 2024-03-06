package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvResult;
    private EditText etLength, etHeight, etWidth;
    private Button btnCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvReselt);
        etLength = findViewById(R.id.etLength);
        etHeight = findViewById(R.id.etHeight);
        etWidth = findViewById(R.id.etWidth);
        btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnCalculate) {
            String inputHeight = etHeight.getText().toString().trim();
            String inputLength = etLength.getText().toString().trim();
            String inputWidth = etWidth.getText().toString().trim();

            Double volume = Double.parseDouble(inputHeight) * Double.parseDouble(inputLength) * Double.parseDouble(inputWidth);
            tvResult.setText(volume.toString());

        }
    }
}