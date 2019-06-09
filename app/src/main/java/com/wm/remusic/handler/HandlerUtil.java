package com.wm.remusic.handler;

import android.content.Context;
import android.os.Handler;

/**
 * Created by wm on 2016/3/26.
 */
public class HandlerUtil extends Handler {
    
    private static HandlerUtil instance = null;
    
    public static HandlerUtil getInstance(Context context) {
        if (instance == null) {
            instance = new HandlerUtil();
        }
        return instance;
    }
}
