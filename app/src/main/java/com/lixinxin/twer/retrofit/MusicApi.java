package com.lixinxin.twer.retrofit;

import com.lixinxin.twer.bean.Music;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by lixinxin on 2016/7/7.
 */
public interface MusicApi {

    @GET("search-ajaxsearch-searchall")
    Observable<Music> getMusicData(@Query("kw") String kw,@Query("pi") int pi,@Query("pz") int pz);


}
