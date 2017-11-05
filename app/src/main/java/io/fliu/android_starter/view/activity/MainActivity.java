package io.fliu.android_starter.view.activity;

import io.fliu.android_starter.R;
import io.fliu.android_starter.base.BaseActivity;

public final class MainActivity extends BaseActivity {

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


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
