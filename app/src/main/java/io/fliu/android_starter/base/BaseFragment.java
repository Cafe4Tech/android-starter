package io.fliu.android_starter.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public abstract class BaseFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(fetchLayoutResource(), container);

        ButterKnife.bind(v, getActivity());

        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        subscribeListeners();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

        unsubscribeListeners();
    }

    @Override
    public void onResume() {
        super.onResume();

        initView();
    }

    @Override
    public void onStop() {
        super.onStop();

        releaseView();
    }


    protected abstract int fetchLayoutResource();
    protected abstract void initView();
    protected abstract void releaseView();
    protected abstract void subscribeListeners();
    protected abstract void unsubscribeListeners();
}
