package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View view){
        TextView text = findViewById(R.id.name);
        String mensagem = text.getText().toString();
        Intent it = new Intent(MainActivity.this, ScreenActivity.class);
        it.putExtra("msg", mensagem);
        startActivity(it);
    }


}