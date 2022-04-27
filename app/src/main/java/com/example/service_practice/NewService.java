package com.example.service_practice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;

import androidx.annotation.Nullable;

public class NewService extends Service {

    // declaring object of MediaPlayer
    private MediaPlayer mPlayer;

    @Override
    public void onCreate()
    {
        Log.d("service","onCreate called");
    }
    // execution of service will start
    // on calling this method
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.d("service", "onStartCommand called");

        // creating a media player which
        // will play the audio of Default
        // ringtone in android device
        mPlayer = MediaPlayer.create( this, Settings.System.DEFAULT_RINGTONE_URI );

        // providing the boolean
        // value as true to play
        // the audio on loop
        mPlayer.setLooping( true );

        // starting the process
        mPlayer.start();

        // returns the status
        // of the program
        return START_STICKY;
    }

    @Override

    // execution of the service will
    // stop on calling this method
    public void onDestroy() {
        Log.d("service","onDestroy called");
        super.onDestroy();

        // stopping the process
        mPlayer.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

