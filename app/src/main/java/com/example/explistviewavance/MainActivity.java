package com.example.explistviewavance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView LV ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("aa","ok0");
        LV=(ListView) findViewById(R.id.LV);
        Log.i("aa","ok1");
       LVCustomAdapter LVC = new LVCustomAdapter(getApplicationContext());
        Log.i("aa","ok2");
        LV.setAdapter(LVC);
        Toast.makeText(this, String.valueOf(Logiciel.getLstLog().size()), Toast.LENGTH_SHORT).show();

    }
}