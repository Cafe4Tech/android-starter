package io.fliu.android_starter.base;

import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import butterknife.ButterKnife;
import io.fliu.android_starter.Config;
import io.fliu.android_starter.R;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public abstract class BaseActivity extends AppCompatActivity{

    boolean backPressEnable = true;
    boolean doubleBackFinishEnabled = false;
    long timeBackPressed = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //去掉标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        //沉浸式设置
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        setContentView(fetchLayoutResource());

        ButterKnife.bind(this);

        init();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //TODO: 在这里存储activity状态
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //TODO: 在这里恢复activity状态
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

    @Override
    protected void onRestart() {
        super.onRestart();
        //TODO: 这里恢复acitivity UI线程
    }


    protected abstract int fetchLayoutResource();
    protected abstract void init();
    protected abstract void requestPermission();

    @Override
    public void onBackPressed() {
        if (backPressEnable) {
            super.onBackPressed();
            if (doubleBackFinishEnabled) {
                if (System.currentTimeMillis() - timeBackPressed < Config.DOUBLE_BACK_INTERVAL) {
                    finish();
                } else {
                    Toast.makeText(this, getString(R.string.toast_double_back), Toast.LENGTH_SHORT).show();
                    timeBackPressed = System.currentTimeMillis();
                }
            }
        }
    }

    public boolean isBackPressEnable() {
        return backPressEnable;
    }

    public void setBackPressEnable(boolean backPressEnable) {
        this.backPressEnable = backPressEnable;
    }

    public boolean isDoubleBackFinishEnabled() {
        return doubleBackFinishEnabled;
    }

    public void setDoubleBackFinishEnabled(boolean doubleBackFinishEnabled) {
        this.doubleBackFinishEnabled = doubleBackFinishEnabled;
    }

}
