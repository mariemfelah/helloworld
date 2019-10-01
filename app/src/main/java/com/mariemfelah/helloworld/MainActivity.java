package com.mariemfelah.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView2= findViewById(R.id.textView2);
        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
                @Override
                        public void onClick(View v){
                    String msg=getResources().getString(R.string.bnj)+" " + editText.getText()+ "!";
                    textView2.setText(msg);

        }});
    }
}
