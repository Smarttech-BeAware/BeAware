package com.project.beaware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class EmergencyActivity extends AppCompatActivity {

    CountDownTimer cTimer = null;
    TextView timerText;
    MediaPlayer mp;
    SharedPreferences mSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        AudioManager audioManager = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE);
        //raise volume 5 times
        audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
        audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
        audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
        audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
        audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
        audioManager = null;

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alarm);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you

    }
}
