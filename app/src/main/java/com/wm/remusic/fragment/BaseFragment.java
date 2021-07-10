package com.wm.remusic.fragment;

import android.app.Activity;

import androidx.fragment.app.Fragment;

import com.wm.remusic.activity.BaseActivity;
import com.wm.remusic.activity.MusicStateListener;

/**
 * Created by wm on 2016/3/17.
 */
public class BaseFragment extends Fragment implements MusicStateListener {

    public Activity mContext;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mContext = activity;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((BaseActivity) getActivity()).setMusicStateListenerListener(this);
        reloadAdapter();
    }

    @Override
    public void onStop() {
        super.onStop();
        ((BaseActivity) getActivity()).removeMusicStateListenerListener(this);
    }

    @Override
    public void updateTrackInfo() {
    }

    @Override
    public void updateTime() {
    }

    @Override
    public void changeTheme() {
    }

    @Override
    public void reloadAdapter() {
    }
}
