package com.example.cw_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        ImageView next = findViewById(R.id.next);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int et2 = Integer.parseInt(age.getText().toString());
                String ne = name.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                intent.putExtra("Aname", et2);
                intent.putExtra("Nname", ne);

                startActivity(intent);

                if(ne == null);
                System.out.println("يجب اكمال البيانات");


            }


        });

    }
}