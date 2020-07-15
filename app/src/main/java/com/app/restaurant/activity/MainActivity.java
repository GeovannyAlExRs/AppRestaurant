package com.app.restaurant.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.restaurant.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonView = findViewById(R.id.buttonView);
        buttonView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        controllerIntent(activity_product.class);
    }

    public void controllerIntent(Class aClass) {
        Intent intent = new Intent(this, aClass);
        startActivity(intent);
    }
}