package com.techpalle.broadcastreceiverexample1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        switch (action){
            case Intent.ACTION_BATTERY_LOW:
                Toast.makeText(context, "Battery Low", Toast.LENGTH_SHORT).show();
                Log.v("receiver", "Battery Low");
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "Charger Unplugged", Toast.LENGTH_SHORT).show();
                Log.v("receiver", "Charger Unplugged");
                break;
            case Intent.ACTION_SCREEN_ON:
                Toast.makeText(context, "Screen ON", Toast.LENGTH_SHORT).show();
                Log.v("receiver", "Screen ON");
                break;
            case Intent.ACTION_SCREEN_OFF:
                Toast.makeText(context, "Screen OFF", Toast.LENGTH_SHORT).show();
                Log.v("receiver", "Screen OFF");
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Toast.makeText(context, "Airplane Mode", Toast.LENGTH_SHORT).show();
                Log.v("receiver", "Airplane Mode");
                break;
        }
    }
}
