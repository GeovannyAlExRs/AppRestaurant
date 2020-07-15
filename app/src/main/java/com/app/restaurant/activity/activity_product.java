package com.app.restaurant.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.app.restaurant.R;

public class activity_product extends AppCompatActivity {//implements View.OnClickListener {

    private Button btn_pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        /*btn_pedido.findViewById(R.id.btnPedido);
        btn_pedido.setOnClickListener(this);*/
    }
/*
    @Override
    public void onClick(View view) {
        controllerIntent(activity_pedido.class);
    }

    public void controllerIntent(Class aClass) {
        Intent intent = new Intent(this, aClass);
        startActivity(intent);
    }*/
}