package com.geektech.a3homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
MainAdapter adapter;
EditText editText;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


    }
    public void initViews(){
        recyclerView=findViewById(R.id.recyclerview);
        adapter=new MainAdapter();
        recyclerView.setAdapter(adapter);
        editText=findViewById(R.id.edit_text);
        button=findViewById(R.id.button);
    }

    public void sendInRecycler(View view){
        String someText = editText.getText().toString();
        adapter.append(someText);
    }
}
