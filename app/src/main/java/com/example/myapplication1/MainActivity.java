package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewTop;
    TextView textViewBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTop = findViewById(R.id.labelTop);
        textViewBottom = findViewById(R.id.labelBottom);
    }

    public void onChangeTextViewTop(View view) {
        textViewTop.setText("Hi SkillBox");
    }

    public void onChangeTextTextViewBottom(View view) {
        textViewBottom.setText("Эта кнопка работает !");
    }
}
