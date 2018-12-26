package com.sheygam.java221_05_12_18;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyMessageService extends FirebaseMessagingService {
    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.d("MY_TAG", "onNewToken: " + s);
        FirebaseMessaging.getInstance().subscribeToTopic("com.sheygam.java221_05_12_18");

    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d("MY_TAG", "onMessageReceived: " + remoteMessage.getNotification().getBody());
    }
}
