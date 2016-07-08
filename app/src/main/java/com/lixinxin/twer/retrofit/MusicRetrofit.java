package com.lixinxin.twer.retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lixinxin on 2016/7/7.
 */
public class MusicRetrofit {

    private static final String BASE_API = "http://v5.pc.duomi.com/";
    private static Retrofit retrofit;

public static Retrofit getRetrofit() {
        if (retrofit == null) {
            synchronized (MusicRetrofit.class) {
                if (retrofit == null) {
                    retrofit = new Retrofit.Builder()
                            .baseUrl(BASE_API)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .build();
                }
            }
        }
        return retrofit;
    }
}
