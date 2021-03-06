package com.uc.utspt_0706011910004.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String name, address;
    private String age;

    public User(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    protected User(Parcel in) {
        name = in.readString();
        address = in.readString();
        age = in.readString();
    }


    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(age);
    }
}
