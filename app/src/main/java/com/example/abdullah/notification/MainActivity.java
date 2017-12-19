package com.example.abdullah.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Clickme();
            }
        });
    }

    private void Clickme() {
        NotificationCompat.Builder builder=(NotificationCompat.Builder) new NotificationCompat.Builder(this).setSmallIcon(R.mipmap.ic_launcher).setContentTitle("nofti").setContentText("this is a notification");
        NotificationManager notification=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notification.notify(0,builder.build() );
    }
}
