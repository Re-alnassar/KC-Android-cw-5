package com.example.cw_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView2 = findViewById(R.id.textView2);
        ImageView imageView5 = findViewById(R.id.imageView5);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);

        Bundle bundle = getIntent().getExtras();


        String tv4 = bundle.getString("tv4name");
        textView4.setText(tv4);


        int tv6 = bundle.getInt("tv6name");
        textView6.setText(String.valueOf(tv6));






    }
}