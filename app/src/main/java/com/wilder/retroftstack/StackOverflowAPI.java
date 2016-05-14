package com.wilder.retroftstack;

/**
 * Created by Wilder on 12/13/2015.
 */

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.Call;

public interface StackOverflowAPI {
    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<StackOverflowQuestions> loadQuestions(@Query("tagged") String tags);
}