package com.stdio.webview_app_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.et);
    }

    public void onClick(View view) {
        String tmpUrl = editText.getText().toString();
        if (!tmpUrl.startsWith("http")) {
            tmpUrl = "http://" + tmpUrl;
        }
        WebviewActivity.URL_STRING = tmpUrl;
        startActivity(new Intent(this, WebviewActivity.class));
    }
}