package com.example.research_paper_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button face_recognition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        face_recognition = (Button) findViewById(R.id.face_detection);

        face_recognition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Openuserurl();
            }
        });
    }

    public void Openuserurl(){
        Intent intent = new Intent(this, UserUrl.class);
        startActivity(intent);
    }
}
