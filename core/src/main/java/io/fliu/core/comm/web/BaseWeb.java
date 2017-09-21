package io.fliu.core.comm.web;

import retrofit2.Retrofit;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public class BaseWeb {
    public String GET(String uri) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(uri)
                .build();
        return "";
    }
}
