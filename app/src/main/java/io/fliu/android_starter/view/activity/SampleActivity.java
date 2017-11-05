package io.fliu.android_starter.view.activity;

import com.bumptech.glide.Glide;

import io.fliu.android_starter.R;
import io.fliu.android_starter.base.BaseActivity;
import retrofit2.http.Url;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public class SampleActivity extends BaseActivity {
    @Override
    protected int fetchLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void requestPermission() {

    }
}
