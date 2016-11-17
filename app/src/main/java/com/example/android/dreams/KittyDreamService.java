package com.example.android.dreams;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.service.dreams.DreamService;
import android.util.Log;
import android.widget.Toast;

public class KittyDreamService extends DreamService {
    public static final String LOG_TAG=KittyDreamService.class.getSimpleName();


    // 1. override onAttachedToWindow
    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(LOG_TAG,"onAttachedToWindow()");

        // Dream is being associated with a window (building it's UI)
        // Perform initial setup and load UI
        // Attach any event handlers

        // 2. set it's content
        setContentView(R.layout.kitty_dream);

        // Allow user touch (by default clicking switches to lock screen (wakes up))
        setInteractive(true);

        // Hide system UI
        setFullscreen(true);

    }

    @Override
    public void onDreamingStarted() {
        super.onDreamingStarted();

        // Entering the running state
        // initiate animations or other forms of "running" behaviour
    }

    @Override
    public void onDreamingStopped() {
        super.onDreamingStopped();

        // exiting the running state
        // stop anything that was started in onDreamingStarted
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        // window is being cleaned
        // cleanup any event handlers from onAttachedToWindow
    }
}
