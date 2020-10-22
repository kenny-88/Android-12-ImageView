package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.im);
        imageView.setOnClickListener(a);
    }

    private View.OnClickListener a = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ImageView imageView2 = (ImageView) findViewById(R.id.im);
            imageView2.setImageResource(R.mipmap.b);
        }
    };
}

