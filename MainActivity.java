package com.example.patrick.broadcastrecebe;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity{

    MyReceiver myReceiver;
    IntentFilter intentFilter;
    EditText etReceivedBroadcast;
    Button btnSendBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etReceivedBroadcast = (EditText) findViewById(R.id.etReceivedBroadcast);

        //Passa a referencia para podermos imprimir nesta interface o resultado.
        MyApplication myApplication = (MyApplication) this.getApplicationContext();
        myApplication.mainActivity = this;

        myReceiver = new MyReceiver();
        intentFilter = new IntentFilter("com.example.patrick.android.USER_ACTION");
    }

}
