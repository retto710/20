package com.example.anthony.a20.Entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    public static final List<Teacher> ITEMS = new ArrayList<Teacher>();
    private static final int NO_IMAGE_PROVIDED = -1;
    private String name;
    private Float rating;
    private int mProfileImage= NO_IMAGE_PROVIDED;

    public Teacher(String Mname, Float Mrating, int MmProfileImage){
        name=Mname;
        rating=Mrating;
        mProfileImage=MmProfileImage;

    }

    public static int getNoImageProvided() {
        return NO_IMAGE_PROVIDED;
    }

    public String getName() {
        return name;
    }

    public boolean hasImage(){
        return mProfileImage!=NO_IMAGE_PROVIDED;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public int getmProfileImage() {
        return mProfileImage;
    }

    public void setmProfileImage(int mProfileImage) {
        this.mProfileImage = mProfileImage;
    }
}
