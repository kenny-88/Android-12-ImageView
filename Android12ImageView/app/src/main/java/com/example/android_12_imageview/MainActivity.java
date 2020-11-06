package com.example.android_12_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setOnClickListener(photoa);
    }

    private View.OnClickListener photoa = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ImageView imageView2 = (ImageView) findViewById(R.id.image);
            imageView2.setImageResource(R.mipmap.photob);
        }
    };
}