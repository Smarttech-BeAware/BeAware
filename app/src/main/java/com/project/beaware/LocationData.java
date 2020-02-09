package com.project.beaware;

import android.content.Context;
import android.os.Handler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LocationData {
    //serialize the fields
    private String mLongitude;
    private  SimpleLocation mLocation;
    public String getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(String mLongitude) {
        this.mLongitude = mLongitude;
    }

    public String getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(String mLatitude) {
        this.mLatitude = mLatitude;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    private String getDateTime(long time){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        Date date = new Date(time);
        return formatter.format(date);
    }

    private String mLatitude;
    private String mTime;

    public void postLocation(Context context){
        mLocation = new SimpleLocation(context,true, false, 1000);
        if(!mLocation.hasLocationEnabled()){
            SimpleLocation.openSettings(context);
        }
        mLocation.beginUpdates();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setmLatitude(String.valueOf(mLocation.getLatitude()));
                setmLongitude(String.valueOf(mLocation.getLongitude()));
                setmTime(getDateTime(mLocation.getTimestampInMilliseconds()));
            }
        }, 5000);

        //make retrofit call
    }
}
