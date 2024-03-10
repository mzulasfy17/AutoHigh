package com.example.autohigh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class Detail extends AppCompatActivity implements Parcelable {
    private String Name;
    private String Price;
    private String EngineType;
    private String Acceleration;
    private String TopSpeed;
    private String Power;
    private String Image;

    protected Detail(Parcel in) {
        Name = in.readString();
        Price = in.readString();
        EngineType = in.readString();
        Acceleration = in.readString();
        TopSpeed = in.readString();
        Power = in.readString();
        Image = in.readString();

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getEngineType() {
        return EngineType;
    }

    public void setEngineType(String engineType) {
        EngineType = engineType;
    }

    public String getAcceleration() {
        return Acceleration;
    }

    public void setAcceleration(String acceleration) {
        Acceleration = acceleration;
    }

    public String getTopSpeed() {
        return TopSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        TopSpeed = topSpeed;
    }

    public String getPower() {
        return Power;
    }

    public void setPower(String power) {
        Power = power;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };

    public Detail() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Price);
        dest.writeString(EngineType);
        dest.writeString(Acceleration);
        dest.writeString(TopSpeed);
        dest.writeString(Power);
        dest.writeString(Image);
    }
}