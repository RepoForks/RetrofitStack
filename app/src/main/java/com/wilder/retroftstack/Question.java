package com.wilder.retroftstack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Wilder on 12/13/2015.
 */
public class Question {

    String title;
    String link;
    String score;
    @SerializedName("view_count")
    @Expose
    private Integer viewCount;
    //String owner;

    @Override
    public String toString() {
        return(title);
    }

}