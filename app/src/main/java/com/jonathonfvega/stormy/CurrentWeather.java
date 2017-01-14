package com.jonathonfvega.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by jonathonfvega on 1/14/17.
 */

public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String Icon) {
        this.mIcon = mIcon;
    }

    public long getTime() {
        return mTime;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);

        return timeString;
    }

    public void setTime(long Time) {
        this.mTime = mTime;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double Temperature) {
        this.mTemperature = mTemperature;
    }

    public double getPrecipChance() {
        return mPrecipChance;
    }

    public void setPrecipChance(double PrecipChance) {
        this.mPrecipChance = mPrecipChance;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double Humidity) {
        this.mHumidity = mHumidity;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String Summary) {
        this.mSummary = mSummary;
    }
}
